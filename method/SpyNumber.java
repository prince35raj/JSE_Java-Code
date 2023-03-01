package method;

public class SpyNumber
{
    int sum = 0;
    int p = 1, d;

    void m1(int n)
    {
        while (n > 0)
        {
            d = n % 10;
            sum = sum + d;
            p = p * d;
            n = n / 10;
        }
        if (sum == p)

            System.out.println("it is spy number");
        else

            System.out.println("it is not spy number:");
    }
    public static void main(String[] args) {
        SpyNumber spy = new SpyNumber();
        spy.m1(1241);
    }
}
