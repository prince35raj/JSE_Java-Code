package Thread;

public class ClassF extends Thread
{
    public void run()
    {
        System.out.println("i am ready for interview:");
        for(int i=1;i<=5;i++)
        {
            System.out.println("this is my "+i+" interview:");
        }
        System.out.println("i got placed now i can relax:");
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {
            System.out.println("my sleep got disturbed:");
        }
        System.out.println("time to go to  office:");
    }

    public static void main(String[] args) {
        ClassF fobj=new ClassF();
        Thread t1=new Thread(fobj);
        t1.start();
        t1.interrupt();
    }
}
 //an interrupt  is an indication for a thread to stop what it is doing and do something else
   // interrupt method will make the sleeping thread to running state
   /* whenever we are using interrupt method thread should be in sleeping state otherwise there will be not
       impact of interrupt method on your program */