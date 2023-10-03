import java.util.*;
class array2{
 public static void main(String ar[])
    {
        System.out.println("Enter the no. of row : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the no. of column : ");
         int c=sc.nextInt();
        int [][]arr=new int[n][c];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter the no. in arr["+i+"]["+j+"]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<c;j++)
            {
            System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }


    }
}