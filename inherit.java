class A{
     void cons()
    {
        System.out.println("Class A");
    }
}
class B extends A{
    void show()
    {
        System.out.println("class B");
    }
}
class C extends B{
    C(){
        System.out.println("multilevel inheritence");
    }
    void display()
    {
        System.out.println("class C");
    }
}class D extends B{
    D(){
    System.out.println("Hierarchical inheritence");
    show();
    }
    void show1()
    {
        System.out.println("class D");
    }
}
class main3{
    public static void main(String ar[])
    {
       B obj=new B();
       obj.cons();
       C obj1=new C();
       obj1.cons();
       obj1.show();
        obj1.display();
        D obj2=new D();
        obj2.cons();
        obj2.show1();
    }
}