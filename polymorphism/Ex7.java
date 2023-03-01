package polymorphism;

public class Ex7 extends Ex6
{
    protected int x=3;
    public int getX()
    {
        return x;
    }
    public int getB()
    {
        return x;
    }

    public static void main(String[] args) {
        Ex6 ex6=new Ex6();
        Ex7 ex7=new Ex7();
        System.out.println(ex6.getX());
        System.out.println(ex7.getB());
        System.out.println(ex7.getX());
        System.out.println(ex6.x);
        System.out.println(ex7.x);

    }

}
