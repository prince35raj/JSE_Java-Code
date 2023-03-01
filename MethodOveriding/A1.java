package MethodOveriding;

public class A1
{
    protected void m1()
    {
        System.out.println("m1 -  A1");
    }
}
class A2 extends A1
{
    public final void m1()
    {
        System.out.println("m1  A2");
    }

    public static void main(String[] args) {
       A1 a1=new A2();
       A2 a2=new A2();
      // a1.m1();
       a2.m1();
    }
}
