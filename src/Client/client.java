package Client;

public class client{

    public static void main(String[] args){
        try {
            int ip = Integer.parseInt(args[0]);
            int port = Integer.parseInt(args[1]);
            int fnID = Integer.parseInt(args[2]);

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
