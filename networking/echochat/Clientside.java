import java.io.*;
import java.net.*;

public class Clientside{
    Socket s;
    DataInputStream din;
    DataOutputStream dout;

    public Clientside(){
        try{
            s=new Socket("localhost", 6666);
            System.out.println(s);
            System.out.println("ij! you are online");
            din=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());

            clientChat();
        }catch(Exception e){}
        
    }
    public  void clientChat()throws IOException{
        String s1,s2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do{
            
            System.out.println("iJ->");
            s2=br.readLine();
            dout.writeUTF(s2);
            dout.flush();
            s1=din.readUTF();
            System.out.println("Admin: "+s1);
        }while(!s2.equals("Bye")); 
    }
    public static void main(String... args){
        new Clientside();
    }
}
