package RecursionPack;

public class ClassB {
    public static void printnumber(int n)
    {
        if (n==5)
        {
            return;
        }
        System.out.println(n);
        printnumber(n+1);
    }

    public static void main(String[] args)
    {
        int n = 1;
        printnumber(n);
    }
}
