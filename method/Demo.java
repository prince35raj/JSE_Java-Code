package method;

public class Demo
{
    int add(int a, int b)
    {
        int c = a + b;
           return c;
    }

    public static void main(String[] args)
    {
     int x=new Demo().add(10,20);
       System.out.println(x);
        Demo a= new Demo();
        int y= a.add(10,20);
        System.out.println(y);

    }
}
