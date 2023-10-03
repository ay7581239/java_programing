import java.util.*;
class basic{
    public static void main(String ar[])
    {
        System.out.println("Enter the no. which you want to even or odd : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
        System.out.println("Odd no. :"+n);
        else
        System.out.println("Even no. : "+n);
    }
}