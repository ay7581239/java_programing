class method{
    void show()
    {
        System.out.println("Without argument & without return type");
    }
   void show(int a)
   {
         System.out.println("With argument & without return type : "+a);
   }
//    int show(){
//      System.out.println("Without argument & with return type");
//      return 1;
//    }
   int show(int a,int b){
     System.out.println("With argument & with return type");
     System.out.print("sum :");
     return a+b;
   }
}
class main1{
    public static void main(String ar[])
    {
        method obj=new method();
        obj.show();
        obj.show(5);
       // System.out.println(obj.show());
        System.out.println(obj.show(2,3));
    }
}