package BankAccount;
import java.util.Scanner;

public class MainAccount
{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

       Account account []=new Account[10];


    }
    public static int AccountMenu(Scanner sc)
    {
        System.out.println("select account type:");
        System.out.println("1.Checking account");
        System.out.println("2.Saving Account");

        int choice;

        do {
            System.out.println("enter choice");
            choice=sc.nextInt();


        }
        while (choice<1||choice>2);
        return choice;
    }

    public int searchAccount(Account  accounts [],int count,int accountnumber)
    {
        for (int i=0;i<count;i++)
        {
            if(accounts [i].getAccountnumber()==accountnumber);
            {
                return i;

            }


        }
        return -1;

    }

    public void dodeposit(Account account [],int count,Scanner sc)
    {
        System.out.println("Enter Account NUmber:");
        int accountNUmber=sc.nextInt();

     //   int index = searchAccount(accounts,count,accountNUmber);


    }

    public static  Account createAccount(Scanner sc) {
        Account account = null;
        int choice = AccountMenu(sc);

        int accountNumber;
        System.out.println("enter account number");
        accountNumber = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter transition fee:");
            double fee = sc.nextDouble();
            account = new CheckingAccount(accountNumber, fee);
        } else {
            System.out.println("enter interest rate:");
            double ir = sc.nextDouble();
            account = new SavingAccount(accountNumber, ir);

        }
        return account;


    }
    public int menu(Scanner sc)
    {
        System.out.println("Bank Account Menu");
        System.out.println("1.Create new Account");
        System.out.println("2.Deposit fund");
        System.out.println("3.Withdraw Funds");
        System.out.println("4.Quit");

        int choice;
        do
        {
            System.out.println("Enter Your Choice");
            choice= sc.nextInt();
        }
        while (choice<1||choice>4);
        return choice;
    }

}
