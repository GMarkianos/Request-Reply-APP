package Client;
import Common.Interface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class client{

    public static void main(String[] args){
        try {
            Registry rmiRegistry = LocateRegistry.getRegistry(5000);
            Interface stub = (Interface) rmiRegistry.lookup("Interface");

            int ip = Integer.parseInt(args[0]);
            int port = Integer.parseInt(args[1]);
            int fnID = Integer.parseInt(args[2]);

            switch(fnID){
                case 1:
                    stub.createAccount(args[3]);
                case 2:
                    stub.showAccounts();
                case 3:
                    stub.sendMessage(args[4],args[5],Integer.parseInt(args[3]));
                case 4:
                    stub.showInbox(Integer.parseInt(args[3]));
                case 5:
                    stub.readMessage(Integer.parseInt(args[4]),Integer.parseInt(args[3]));
                case 6:
                    stub.deleteMessage(Integer.parseInt(args[4]),Integer.parseInt(args[3]));
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
