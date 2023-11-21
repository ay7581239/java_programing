import java.net.*;
import java.io.*;
public class server{
    public static void main(String ar[])
    {
        try{
            System.out.println("wait for client ");
            ServerSocket ss=new ServerSocket(5050);
            Socket soc =ss.accept();
            System.out.println("connetion establish ");
            BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
             System.out.println("client msg "+br.readLine());
          
           
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
