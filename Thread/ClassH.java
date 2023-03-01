package Thread;

public class ClassH extends Thread {

    public static void main(String[] args) throws InterruptedException{

        ClassG gobj=new ClassG();
        gobj.start();

        for(int i=1;i<=5;i++)
        {
            Thread.yield();
            System.out.println("Class G:"+i);
        }
    }

}
/* A yield() method is a static method of Thread class and it can stop the currently executing thread
    and will give a chance to other waiting threads of the same priority
 */

/* yield method provide a mechanising to inform thread scheduler that current thread is
 willing to hand over its use of processor, but it'd to be scheduled back as soon as possible */

