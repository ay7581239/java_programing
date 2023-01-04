import java.util.Scanner;
class attendence
{
public static void main(String arg[])
{
int n,a,b,p;
Scanner s=new Scanner(System.in);
System.out.println("Enter the working day");
n=s.nextInt();
System.out.println("Enter the absent day");
a=s.nextInt();
b=n-a;
p=(b*100)/n;
if(p<75)
System.out.println("not eligible for exam");
else
System.out.println("eligible for exam");
}
}
