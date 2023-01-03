import java.util.Scanner;
class Armstrong

{
public static void main(String arr[])
{
int i,n,count=0,sum;
int temp=n;
Scanner S=new Scanner(System.in);
n= s.nextInt();
while(n!=0)
{
n=n/10;
count++;
}
while(n>0)
{
n=temp%10;
sum=sum+Math.pow(n*1.0,(count++)*1.0);
n=temp/10;
}
if(temp==sum)
System.out.println("armstrong");
else
System.out.println("not armstrong");

}
}



