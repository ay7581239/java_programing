import java.io.*;
class buffer1{
    static void validate(int age)
    {
        if(age<18)
        {
            System.out.println("Not valid");
        }
        else
        {
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String ar[])throws IOException{
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int age;
        System.out.println("Enter the age ");
        age=Integer.parseInt(br.readLine());
        buffer1 obj=new buffer1();
        obj.validate(age);
    }
}