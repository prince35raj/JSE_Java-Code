package CollectionFramworkpack;

import java.util.Scanner;

public class Tution {
    int num;
    int age;
    String m = "math";
    String e = "enlish";
    String h = "hindi";

    Scanner sc = new Scanner(System.in);


    void meth1( int price)
    {
        int totalprice = price * 100;

        System.out.println("Total price :" + price);

        System.out.println("welcome to stellar education");

        System.out.println("=========================================");

        System.out.println("Available course in our tuition:");

        System.out.println("1) math\n" + "2) english\n" + "3) hindi\n");

        System.out.println("Please enter your choice ? ");

        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("math");

                System.out.println("enter your age");
                age = sc.nextInt();

                if (age >= 5) {
                    System.out.println("u can join math class");
                } else
                    System.out.println("sorry u cant join math class");
                break;

            case 2:
                System.out.println("english");

                if (age >= 5) {

                    System.out.println("");
                }
        }


    }

    public static void main(String[] args) {
        new Tution().meth1(500);


    }


}
