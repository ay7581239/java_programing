import java.util.*;
class cons{
    cons()
    {
        System.out.println("default constructor");
    }
   cons(int a)
   {
         System.out.println("paramerised constructor");
   }
}
class main2_con{
    public static void main(String ar[])
    {
       cons obj=new cons();
       cons obj1=new cons(1);
    }
}