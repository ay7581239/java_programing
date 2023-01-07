class circle
{ static double pi=3.14;
	public static void main(String arg[])
{
	int r;
	double area,per;
	r=Integer.parseInt(arg[0]);
	per=2*pi*r;
	area=pi*r*r;
	System.out.println("perimeter of circle="+per+"\n area of circle="+area);
	
}
}