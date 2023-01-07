class circle1
{ static double pi=3.14;

void area(int a)
{
	System.out.println(+(pi*a*a));
}
void area(double a)
{
	System.out.println(+(pi*a*a));
}
}
class main
{
	public static void main(String args[])
{
	circle1 b=new circle1();
	b.area(3);
	b.area(3.14d);
}
}