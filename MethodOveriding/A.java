package MethodOveriding;

public class A
{
    private void m1()
    {
        System.out.println("m1   A");
    }
}
class B extends A
{
    private void m1()
    {
        System.out.println("m1");
        System.out.println("m1   B");
    }

    public static void main(String[] args) {
      B b= new B();
     // A a=new A();
      b.m1();
      //a.m1();
    }
}


