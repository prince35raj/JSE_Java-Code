package Exceptionpack;

public class ClassA {

    void meth1() {
        System.out.println(10);
        try {
            System.out.println("try block executed");
            System.out.println("======>" + 20 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("catch block executed");
             System.err.println(e.getMessage()); // Reason of Exception
           // System.out.println(e.toString());   // Name & reason of the Exception
           // e.printStackTrace(); // Complete info about the exception will be displayed
        }
        finally {
            System.out.println("finally block executed");
        }
        System.out.println(30);
    }

    public static void main(String[] args) {
       ClassA  aboj= new ClassA();
         aboj.meth1();
    }

}
