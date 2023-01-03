import java.util.Scanner;
class age_voting
{
	public static void main(String arg[])
{
	int a;
	System.out.println("Enter the age :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	if(a<=18)
	{
		System.out.println("Not eligible for voting");}
	else
	{
		System.out.println("Eligible for voting");}
}
}