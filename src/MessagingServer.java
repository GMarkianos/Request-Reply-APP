import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class MessagingServer extends UnicastRemoteObject implements Interface {
    public MessagingServer() throws RemoteException {
        super();
    }
    public static int authToken=1000;
    int message_id=1;
    public List<Account> accounts = new ArrayList<>();
    public boolean authVer(int token) throws RemoteException{
        for(Account i:accounts){
            if(i.getAuthToken()==token){
                return true;
            }
        }
        return false;
    }
    @Override
    public int createAccount(String name) throws RemoteException {
        if(!name.matches("[a-zA-Z0-9-]*")){System.out.println("Invalid Username\n"); return 0;}
        for(Account i:accounts){
            if(i.getUsername().equals(name)){
                System.out.println("Sorry, the user already exists\n");
                return 0;
            }
        }
        Account acc = new Account(authToken,name);
        authToken++;
        accounts.add(acc);
        System.out.println(acc.getAuthToken()+"\n");
        return acc.getAuthToken();
    }

    @Override
    public void showAccounts(int token) throws RemoteException {
        if(!authVer(token)){
            System.out.println("Invalid Auth Token");
            return;
        }
        int index=1;
        for(Account i:accounts){
            System.out.println(index+"."+i.username);
            index++;
        }
    }

    @Override
    public void sendMessage(String recipient, String text, int token) throws RemoteException {
        if(!authVer(token)){
            System.out.println("Invalid Auth Token");
            return;
        }
        String sender="";
            for (Account i : accounts) {
                if (i.getAuthToken() == token) {
                    sender = i.username;
                }
            }

        Message message = new Message(sender,recipient,text,message_id);
        message_id++;
        boolean flag=false;
        for(Account j:accounts){
            if(j.getUsername().equals(recipient)){
                j.messageBox.add(message);
                System.out.println("OK\n");
                flag=true;
                break;
            }
        }
        if(!flag){System.out.println("User does not exist\n");}
    }

    @Override
    public void showInbox(int token) throws RemoteException {
        if(!authVer(token)){
            System.out.println("Invalid Auth Token");
            return;
        }
        for(Account i:accounts){
            if(i.getAuthToken()==token){
                for(Message j: i.messageBox){
                    if(j.getRead()){
                        System.out.println(j.id+". from: "+j.sender+"\n");
                    }else{
                        System.out.println(j.id+". from: "+j.sender+"*\n");
                    }
                }
            }
        }

    }

    @Override
    public void readMessage(int m_id,int token) throws RemoteException {
        if(!authVer(token)){
            System.out.println("Invalid Auth Token");
            return;
        }
        boolean flag = false;
        for(Account i:accounts){
            if(i.getAuthToken()==token){
                for(Message j:i.messageBox){
                    if(j.getID()==m_id){
                        System.out.println("("+j.getSender()+")"+j.getBody()+"\n");
                        j.setRead(true);
                        flag=true;
                        break;
                    }
                }
            }
        }
        if(!flag){System.out.println("Message ID does not exist)");}
    }

    @Override
    public void deleteMessage(int m_id,int token) throws RemoteException {
        if(!authVer(token)){
            System.out.println("Invalid Auth Token");
            return;
        }
        boolean flag = false;
        for(Account i:accounts){
            if(i.getAuthToken()==token){
                int k=0;
                for(Message j:i.messageBox){
                    if(j.getID()==m_id){
                        i.messageBox.remove(j);
                        flag=true;
                        System.out.println("OK");
                        break;
                    }
                    k++;
                }
            }
        }
        if(!flag){System.out.println("Message does not exist");}
    }
}
