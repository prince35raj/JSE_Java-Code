package Thread;

public class ClassThred extends Thread
{
    public void run()
        {
            for (int i=1;i<=5;i++)
                System.out.println("run() executed:"+i);

        }

    public static void main(String[] args) {
         ClassThred obj =new ClassThred();
         Thread t=new Thread(obj);
         t.start();
    }
}
