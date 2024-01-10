import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server{
    public static void main(String[] args) throws RemoteException {
        try {
            MessagingServer stub = new MessagingServer();

            Registry rmiRegistry = LocateRegistry.createRegistry(Integer.parseInt(args[0]));

            rmiRegistry.rebind("Interface", stub);

            System.out.println("Online");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
