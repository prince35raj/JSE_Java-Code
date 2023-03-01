package Inheritance;

public class AA
{
    int x=20;
    int y=30;

    void msg1()
    {
        System.out.println("msg1 from AA");
    }
    void msg2()
    {
        System.out.println("msg2 From BB");
    }
    class BB extends AA
    {
        void msg2()
        {


        }
    }
}
