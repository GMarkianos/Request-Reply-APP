import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable{
    private int authToken;

    public String username;

    public List<Message> messageBox;



    public Account(int id, String name){

        authToken=id;
        username = name;
        messageBox = new ArrayList<>();

    }

    public int getAuthToken() {
        return authToken;
    }

    public void setAuthToken(int authToken) {
        this.authToken = authToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Message> getMessageBox() {
        return messageBox;
    }

    public void setMessageBox(Message m){
        messageBox.add(m);
    }
}
