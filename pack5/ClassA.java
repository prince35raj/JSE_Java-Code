package pack5;

public class ClassA extends ClassB implements interfaceA, interfaceB //multiple inheritance
{

    @Override
    public void meth1() {
        System.out.println("Class A abstract method overridden");

    }

    @Override
    public void msg() {
        interfaceA.super.msg();
        interfaceB.super.msg();
    }

    @Override
    public void show() {
        System.out.println("interface Class B abstract method overridden ");


    }

    public static void main(String[] args) {
        interfaceA aboj = new ClassA();
        aboj.meth1();
        aboj.meth2();

        interfaceB bobj = new ClassA();
        bobj.show();

        new ClassA().display();

        ClassA aobj2 = new ClassA();
        aobj2.msg();


    }
}
