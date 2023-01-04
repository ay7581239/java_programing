import java.util.Scanner;
class bill
{
	public static void main(String arg[])
{
	int a,b,unit,rs;
	System.out.println("Enter the current unit :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Enter the last unit :");
	b=sc.nextInt();
	unit=a-b;
	if(unit<=100)
{
	System.out.println("no charge"); 
}
	else if(unit<=200)
{
	rs=(200-unit)*5;
	System.out.println("Charge ="+rs);
}
	else 
{
	rs=(unit-200)*10+500;
	System.out.println("Charge ="+rs);
}

}
}