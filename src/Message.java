import java.io.*;

public class Message implements Serializable {
    public boolean Read;
    public String sender;
    public String receiver;
    public String body;
    int id;

    public Message(String sender, String receiver, String body,int id){
        this.sender = sender;
        this.receiver = receiver;
        this.body = body;
        Read = false;
        this.id = id;
    }

    public void setRead(boolean read) {
        Read = read;
    }

    public String getBody() {return body;}

    public String getSender() {
        return sender;
    }
    public boolean getRead(){
        return Read;
    }
    public int getID(){
        return id;
    }
}
