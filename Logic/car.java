package Logic;
import java.util.Scanner;
public class car
{
 //  Scanner sc= new Scanner(System.in);
    void car(int t)
    {
      //  int t;
        int y=300;
       // System.out.println("Enter km");
     //   t= sc.nextInt();
        if(t>0)
        {
            System.out.println(t*y);
        }
    }
    public static void main(String[] args)
    {
        car obj=new car();
        obj.car(8);

    }
}