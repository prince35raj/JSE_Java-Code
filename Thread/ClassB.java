package Thread;

public class ClassB extends Thread{

    public void run()
    {
        String name = Thread.currentThread().getName();
        int priority=Thread.currentThread().getPriority();
        for(int i=1;i<=5;i++)
        {
            System.out.println(name+"("+priority+") "+"has executed run()"+i);
        }

    }

    public static void main(String[] args) {
        ClassB bobj=new ClassB();
        Thread t1=new Thread(bobj);
        Thread t2=new Thread(bobj);

        t1.setName("tom");
        t2.setName("jerry");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }
}

  // (Thread Execution Depended on ===== Thread Scheduler basing on two aspect Thread properties + underlying OS)
