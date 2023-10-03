package Mathematics;
public class Matrix{
   public void add(int arr1[][],int arr2[][])
   {
    System.out.println("Add :");
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(arr1[i][j]+arr2[i][j]+" ");
        }System.out.println();
    }
   }
   public void sub(int arr1[][],int arr2[][])
   {
    System.out.println("subtract :");
     for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(arr1[i][j]-arr2[i][j]+" ");
        }System.out.println();
    }
   }
}