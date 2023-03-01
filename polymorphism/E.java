package polymorphism;

public class E {
    private int x = 1;

    protected void SetX(int a) {
        x = a;
    }

    protected int getX() {
        return x;
    }
}
class F extends E
{
    public int getF() {
        SetX(2);
        //    return x; return x; It does not work because private modifier, so
        return getX();
    }


    public static void main(String[] args) {
        E e = new E();
        F f = new F();
        System.out.println(e.getX()); // e.x is not allowed, private!
        System.out.println(f.getF());

    }
}


