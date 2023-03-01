package Inheritance;

public class spy extends odd_even {
    int p = 1, s = 0, r;

    void m2() {
        while (n > 0) {
            r = n % 10;
            s = s + r;
            p = p * r;
            n = n / 10;
        }
        if (s == p)
            System.out.println("spy");
        else
            System.out.println("not spy");

    }

    public static void main(String[] args) {
        spy sp = new spy();
        sp.m1(123);
        sp.m2();
    }
}

