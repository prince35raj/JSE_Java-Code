package pack5;

public interface interfaceA
{
    void meth1();//abstract method

    default void meth2()
    {
        System.out.println("default method of interface of A");
        this.meth4();
    }
     static void meth3()
    {
        System.out.println("static method of interface of A");

    }
    private void meth4()
    {
        System.out.println("private method of interface of A");

    }
    default void msg()
    {
        System.out.println(" i am form interface A");
    }

    public static void main(String[] args) {
        System.out.println("main() executed");
         interfaceA.meth3();
    }


}
