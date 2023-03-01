package method;

public class Factor {
    void m1(int n) {
        for (int i = 1; 1 <= n; ++i)
        {
            if (n % i == 0)
            {
                System.out.println(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        Factor f = new Factor();
        f.m1(6);
    }
}
