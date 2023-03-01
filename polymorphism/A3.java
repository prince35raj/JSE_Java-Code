package polymorphism;

public class A3
{
    public static void main(String[] args) {
        A1 a1=new A1();
        A1 a2=new A2();

        System.out.println(a1.getX());
        System.out.println(a2.getX());
        System.out.println(a1.x);
        System.out.println(a2.x);


    }
}
