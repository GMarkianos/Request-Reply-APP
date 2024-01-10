import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args){
        try {
            Registry rmiRegistry = LocateRegistry.getRegistry(5000);
            Interface stub = (Interface) rmiRegistry.lookup("Interface");

            String ip = args[0];//Integer.parseInt(args[0]);
            int port = Integer.parseInt(args[1]);
            int fnID = Integer.parseInt(args[2]);

            switch(fnID){
                case 1:
                    stub.createAccount(args[3]);
                    break;
                case 2:
                    stub.showAccounts(Integer.parseInt(args[3]));
                    break;
                case 3:
                    stub.sendMessage(args[3],args[4],Integer.parseInt(args[5]));
                    break;
                case 4:
                    stub.showInbox(Integer.parseInt(args[3]));
                    break;
                case 5:
                    stub.readMessage(Integer.parseInt(args[3]),Integer.parseInt(args[4]));
                    break;
                case 6:
                    stub.deleteMessage(Integer.parseInt(args[3]),Integer.parseInt(args[4]));
                    break;
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
