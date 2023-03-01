package pack4;

public class ClassB extends ClassA
{
    void meth2()
    {
        System.out.println("ClassB method");

    }

    public static void main(String[] args) {
       ClassA aboj = new ClassA(); // Has A relation
        aboj.meth1();
        // aboj.meth2(); C.E
        System.out.println("------------------");

          ClassA aboj2= new ClassB();
          aboj2.meth1();
          // aboj2.meth2(); C.E
        System.out.println("-----------------");

           ClassB cobj=new ClassB();
           cobj.meth1(); // parent class method
           cobj.meth2(); // child class method
        System.out.println("----------------------------");
    }



}
