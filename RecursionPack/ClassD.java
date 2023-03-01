package RecursionPack;

public class ClassD
{
    public static int factorical(int n)
    {
        if(n==1||n==0)
        {
            return 1;

        }
        int fact_nm1=factorical(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n=5;
        int result=factorical(n);
        System.out.println(result);
    }
}
