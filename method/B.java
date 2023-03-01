package method;

public class B {
    int i, fact = 1;

    int m1(int n) {
        for (i = 1; i <= n; i++)

            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        B obj = new B();
        int x= obj.m1(5);
        System.out.println(x);

    }
}
