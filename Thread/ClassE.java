package Thread;

public class ClassE {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("j");

        Thread.sleep(10000);

        System.out.println("a");

        Thread.sleep(10000);

        System.out.println("v");

        Thread.sleep(10000);

        System.out.println("a");
        Thread.sleep(10000);
    }
}
// if we want a thread to pause its execution for a given amount of time we should use sleep method

    /* sleep method is a static method which is present in thread class,
       so we can access the sleep method directly with the help of class name */

// there are two version of sleep method (1).Thread.sleep (long millisecs) 2.Thread .sleep (long millisces,int nanosec)
