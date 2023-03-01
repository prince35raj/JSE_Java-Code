package polymorphism;

public class A2 extends A1
{
    protected int x=3;

    public int getX()
    {
        setX(2);
        return x;
    }
    public int getB()
    {
        return x;
    }
}
