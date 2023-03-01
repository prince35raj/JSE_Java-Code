package polymorphism;

public class Ex9main
{
    public static void main(String[] args)
    {
        Ex8 ex8=new Ex8();
        Ex8 ex=new Ex9();
        System.out.println(ex8.getX());
        System.out.println(ex.getX());
        // System.out.println(ex.);
        System.out.println(ex8.x);
        System.out.println(ex.x);

    }
}
