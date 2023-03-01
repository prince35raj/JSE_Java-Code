package Thread;

public class ClassA extends Thread{

    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("run() executed"+i);
        }
    }

    public static void main(String[] args) {
        ClassA tr=new ClassA();
        Thread t1=new Thread(tr);
        Thread t2=new Thread();

          t1.start();

        /*     A new Thread will be created ,& that new thread is responsible running
               the run() present in classA
     */
      //  t1.run();

        /* no new thread will be created ,& we are calling run() which is present
            in Thread Class, which will be executing ClassA run()
         */

       // t2.start();

        /* A Thread will be created & that new thread is responsible
            running the run() present in ClassA
         */


      // t2.run();

        /* no thread will be created & , We are calling run() which is present
          in thread class which will be executing Thread Class run()
         */

}}
