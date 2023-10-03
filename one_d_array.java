import java.util.*;
class array1{
 public static void main(String ar[])
    {
        System.out.println("Enter the no. of row");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the no. :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }


    }
}