package Thread;

public class Deadlock {
    public static void main(String[] args) {

        final String A = "java";
        final String B = "Python";

        Thread t1 = new Thread() {

            public void run() {
                synchronized (A) {
                    System.out.println("Thread 1 locked on A "); // java is held by Thread 1
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (B) { // Thread 1 will be waiting for python
                        System.out.println("Thread 1 locked on B");
                    }
                    System.out.println("no dead lock ");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (B) { //python held by thread 2
                    System.out.println("Thread 2 locked on B");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (A) { // Thread 2 Waiting for java
                        System.out.println("Thread 2 locked on A");
                    }
                }
                System.out.println("no dead lock");
            }
        };
                t1.start();
                t2.start();


    }
}

