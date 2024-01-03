package Server;
import Common.Interface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessagingServer extends UnicastRemoteObject implements Interface {
    public MessagingServer() throws RemoteException {
        super();
    }
    int authToken=1000;
    @Override
    public int createAccount(String name) throws RemoteException {

        return 0;
    }

    @Override
    public void showAccounts() throws RemoteException {

    }

    @Override
    public void sendMessage(String recipient, String text, int token) throws RemoteException {

    }

    @Override
    public void showInbox(int token) throws RemoteException {

    }

    @Override
    public void readMessage(int m_id) throws RemoteException {

    }

    @Override
    public void deleteMessage(int m_id) throws RemoteException {

    }
}
