import java.util.Scanner;
class circle2
{int r; static double pi=3.14;

void area(int a)
{
	System.out.println(+(pi*a*a));
}
void area(double a)
{
	System.out.println(+(pi*a*a));
}
}
class m1
{
	public static void main(String args[])
{ int m;
	double n;
	circle1 b=new circle1();
	Scanner s=new Scanner(System.in);
	m=s.nextInt();
	n=s.nextDouble();
	b.area(m);
	b.area(n);
}
}