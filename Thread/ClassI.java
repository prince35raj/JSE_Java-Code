package Thread;

public class ClassI extends Thread {

    public void run() {
        CriticalResource();

    }

    synchronized void CriticalResource() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " has entered CriticalResource()");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " count :" + i);

        }
        System.out.println(name + " completed execution :");


    }

    public static void main(String[] args) {
        ClassI iobj = new ClassI();
        Thread t1 = new Thread(iobj);
        Thread t2 = new Thread(iobj);

        t1.setName("thread 1");
        t2.setName("thread 2");

        t1.start();
        t2.start();
    }

}
/* synchronization is a process of making only one thread access a resources where multiple thread are trying
    to access same resources,& moving all remaining thread into waiting state */

