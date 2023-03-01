package Thread;

public class ClassM {
    public static void main(String[] args) {
        ClassL lobj = new ClassL(); //Creating object classL
        new Thread() {
            public void run() {
                try {
                    lobj.with_draw(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
                .start();
        new Thread()
        {
            public  void run()
            {
                lobj.deposit(10000);
            }
        }
                .start();

    }
}