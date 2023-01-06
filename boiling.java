import java.util.Scanner;
class boiling
{
	public static void main(String arg[])
{
	int n;
	System.out.println("Enter the temperature in c :");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n<=100)
	System.out.println("water is not boil");
	else
	System.out.println("water is boil");

}
}