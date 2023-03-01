package Encapsulation;

import java.util.Scanner;

public class AccountMainMethod {
    void meth1() {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        System.out.println("Enter Ac_number");
        long number = sc.nextLong();
        ac.setAc_number(number);

        System.out.println("Enter name");
        String name = sc.nextLine();
        ac.setName(name);


        System.out.println("Enter ammount");
        float ammount = sc.nextFloat();
        ac.setAmmount(ammount);


        System.out.println("Enter Email");
        String mail = sc.nextLine();
        ac.setEmail(mail);


        System.out.println("Ac_number: " + ac.getAc_number());
        System.out.println("Name : " + ac.getName());
        System.out.println("Mail: " + ac.getEmail());
        System.out.println("ammount:" + ac.getAmmount());

    }

    public static void main(String[] args) {
        new AccountMainMethod().meth1();

    }

}


