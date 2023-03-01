package polymorphism;


// Public instance variable and instance method can be inherited and accessed by subclass (without overriding
public class C {
    public int x = 1;

    public void setx(int a) {
        x = a;
    }
}

class D extends C {
    public int getD() {
        setx(2);
        return x;
    }

    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        System.out.println(c.x);
        System.out.println(d.getD());
    }


}

