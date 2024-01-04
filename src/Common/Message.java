package Common;
import java.io.*;

public class Message implements Serializable {
    public boolean Read;
    public String sender;
    public String receiver;
    public String Body;


    public void setBody(String body) {
        Body = body;
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

    public String getBody() {
        return Body;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSender() {
        return sender;
    }
    public boolean getRead(){
        return Read;
    }
}
