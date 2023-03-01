package method;

public class aramstrong
{
    int temp,total=0,number;

    aramstrong(int n)
    {
        while(n !=0)
        {
            temp=n%10;
            total=total+temp*temp*temp;
            n/=10;
        }
        if (total==n)
            System.out.println(n+" armstrong number");
        else
            System.out.println(n+ "not armstrong number");
    }

    public static void main(String[] args)
    {
        aramstrong a=new aramstrong(370);

    }

    }

