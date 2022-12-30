import java.util.*;
class array
{
	public static void main(String args[])
	{ int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<5;i++){
			System.out.println(arr[i]+" ");
		}
		
	}
}