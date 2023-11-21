import java.net.*;
import java.io.*;
public class client{
    public static void main(String ar[])
    {
        try{
            System.out.println("client is ready ");
            Socket soc =new Socket("127.0.0.1",5050);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the message for server");
            String cin=br.readLine();
            PrintWriter cout=new PrintWriter(soc.getOutputStream(),true);
            cout.println(cin);
            soc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
} 
