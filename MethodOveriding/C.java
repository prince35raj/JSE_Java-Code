package MethodOveriding;

public class C
{
    public final void m1()
    {
        System.out.println("m1  C");
    }
}
class D extends C
{
  //  public final void m1()
    {
        System.out.println("m1  D");
    }

    public static void main(String[] args)
    {
        D d=new D();
         d.m1();
    }
}
    //If the parent class method is declared as final,you cannot override it in the child class.
     //If you are trying to override it, you will get the compile-time error-“Overridden method is final”.


