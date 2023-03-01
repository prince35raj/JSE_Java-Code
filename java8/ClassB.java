package java8;

public class ClassB {
    void m1() {
        System.out.println("implementing method referencing");

      /*  interfaceD c=()->
        {
            System.out.println(10);
            System.out.println(20);
            System.out.println("hello");
        };

       */

        //   interfaceD c=new ClassC()::m2; // normal method referencing
        //    interfaceD c = ClassC::m3; // static method referencing
        interfaceD c = ClassC::new;
        c.meth1();
    }

    public static void main(String[] args) {
        new ClassB().m1();
    }
}
