import Mathematics.Matrix;
import java.util.*;
class pack_test{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[2][2];
        int arr2[][]=new int[2][2];
        for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print("Enter value in arr1["+i+"]["+j+"]");
            arr1[i][j]=sc.nextInt();
        }
    }
     for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print("Enter value in arr2["+i+"]["+j+"]");
            arr2[i][j]=sc.nextInt();
        }
    }
   
        Matrix obj=new Matrix();
        obj.add(arr1,arr2);
        obj.sub(arr1,arr2);
    }
}