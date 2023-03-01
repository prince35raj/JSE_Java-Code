package Inheritance;

public class F extends E
{
    void meth1()
    {
        System.out.println();
    }

    public static void main(String[] args)
    {
        E obj=new E();
        System.out.println("value of x:"+ obj.x); // x of ClassE
        System.out.println("value of x;"+obj.y);  // y of E Childclass
        obj.msg();
        obj.msg2();

       ClassD obj2=new E();
        System.out.println("value of classD :"+obj2.x);
        obj2.msg();

    }

}
