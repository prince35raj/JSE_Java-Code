package Thread;

public class Classj extends Thread {

    int availableBerths = 1;
    int wantedBerths;

    Classj(int requiredBerths) {
        wantedBerths = availableBerths;
    }

    public void run() {
        synchronized (this) {
            System.out.println("availableBerth:" + availableBerths);
            if (availableBerths >= wantedBerths) {
                String name = Thread.currentThread().getName();
                System.out.println(wantedBerths + " allocated to:" + name);
                availableBerths = availableBerths - wantedBerths;
            } else {
                System.out.println("sry no berth:");
            }
        }
    }
    public static void main(String[] args) {
        Classj jobj = new Classj(1);
        Thread t1 = new Thread(jobj);
        Thread t2 = new Thread(jobj);

        t1.setName("prince");
        t2.setName("Prince Henry");

        t1.start();
        t2.start();


    }
}
