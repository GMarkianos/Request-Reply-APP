package Common;
import java.io.*;

public class Message implements Serializable {
    public boolean Read;
    public String sender;
    public String receiver;
    public String body;
    int id;

    public Message(String sender, String receiver, String body,int id){
        sender = this.sender;
        receiver = this.receiver;
        body = this.body;
        Read = false;
        id = this.id;
    }

    public void setBody(String body) {
        body = this.body;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRead(boolean read) {
        Read = read;
    }

    public String getBody() {return body;}

    public String getReceiver() {
        return receiver;
    }

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
