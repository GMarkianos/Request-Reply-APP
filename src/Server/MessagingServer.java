package Server;
import Common.Account;
import Common.Interface;
import Common.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class MessagingServer extends UnicastRemoteObject implements Interface {
    public MessagingServer() throws RemoteException {
        super();
    }
    int authToken=1000;
    public List<Account> accounts = new ArrayList<>();
    @Override
    public int createAccount(String name) throws RemoteException {
        if(!name.matches("[A-Za-z0-9]-")){System.out.println("Invalid Username"); return 0;}
        for(Account i:accounts){
            if(i.getUsername().equals(name)){
                System.out.println("Sorry, the user already exists");
                return 0;
            }
        }
        Account acc = new Account(authToken,name);
        authToken++;
        accounts.add(acc);
        return acc.getAuthToken();
    }

    @Override
    public void showAccounts() throws RemoteException {
        int index=1;
        for(Account i:accounts){
            System.out.println(index+"."+i.username);
            index++;
        }
    }

    @Override
    public void sendMessage(String recipient, String text, int token) throws RemoteException {

    }

    @Override
    public void showInbox(int token) throws RemoteException {
        List<Message> inbox;
        for(Account i:accounts){
            if(i.getAuthToken()==token){
                inbox = i.getMessageBox();
                for(Message j: inbox){
                    if(j.getRead()){
                        System.out.println();
                    }else{
                        System.out.println();
                    }
                }
            }
        }

    }

    @Override
    public void readMessage(int m_id) throws RemoteException {

    }

    @Override
    public void deleteMessage(int m_id) throws RemoteException {

    }
}
