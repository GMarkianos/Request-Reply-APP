package Common;
import java.io.*;
import java.util.List;

public class Account implements Serializable{
    private int authToken;

    public String username;

    public List<Message> messageBox;

    public int index=0;

    Account(int id, String name){

        authToken=id;

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

    public void setMessageBox(List<Message> messageBox) {
        this.messageBox = messageBox;
    }
}
