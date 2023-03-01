package polymorphism;

public class Ex5 extends Ex4
{
    public int getB()
    {
        setX(2);
        return x;
    }

    public static void main(String[] args) {
        Ex4 ex4=new Ex4();
        Ex5 ex5=new Ex5();

        System.out.println(ex4.getX());
        System.out.println(ex5.x);
        System.out.println(ex5.getB());
    }
}
