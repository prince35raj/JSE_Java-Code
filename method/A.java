package method;

public class A
{
    void meth1(int a)
    {
        if(a%2==0)
        {
            System.out.println("Number is even");
        }
        else
            System.out.println("number is odd");
    }

    public static void main(String[] args)
    {
       A a= new A();
       a.meth1(5);

    }
}
