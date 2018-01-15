import java.io.*;
import java.net.*;

public class Serverside{
    ServerSocket ss;
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;
    
    public Serverside(){
        try{
            ss=new ServerSocket(6666);
            s=ss.accept();
            System.out.println(s);
            System.out.println("You are Connected to iJ");
            dis=new DataInputStream(s.getInputStream());
            dos=new DataOutputStream(s.getOutputStream());

            serverChat();
        }catch(Exception e){
            System.out.println("Fatal error has occurred: "+e);
        }
        
    }
    public void serverChat()throws IOException{
        String s1, s2;
        do{
            s1=dis.readUTF();
            System.out.println("iJ: "+s1);

            BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
            System.out.println("aTia's->");
        
            s2=br.readLine();
            dos.writeUTF(s2);
            dos.flush();
        }while(!s2.equals("bye"));
    }
    public static void main(String... args){
        new Serverside();
    }
}
