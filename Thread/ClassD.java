package Thread;

public class ClassD {

    public static void main(String[] args) throws InterruptedException {

       ClassC cobj= new ClassC();
       cobj.start();

       cobj.join();
       /* Join method allows the current executing thread
          to wait for the completion of the another thread */

       for(int i=1;i<=5;i++)
       {
           System.out.println("Class D main () :"+ i);
       }

    }

}
