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

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
