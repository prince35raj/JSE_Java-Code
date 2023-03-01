package method;

public class C
{
    int check(int number)
    {
        int fact=1;
        for (int i=1;i<=number;i++)
            fact=fact*i;

        return fact;

    }

    public static void main(String[] args) {
        C obj=new C();
        int x=obj.check(5);
        System.out.println(x);

    }
}


