package Common;
import java.rmi.*;
public interface Interface extends Remote{
    int createAccount(String name) throws RemoteException;

    void showAccounts() throws RemoteException;

    void sendMessage(String recipient, String text, int token) throws RemoteException;

    void showInbox(int token) throws RemoteException;

    void readMessage(int m_id) throws RemoteException;

    void deleteMessage(int m_id) throws RemoteException;
}
