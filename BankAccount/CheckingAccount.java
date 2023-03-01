package BankAccount;


// child Class
public class CheckingAccount extends Account {
    // transition fee
    public static final double FEE = 2.5;


    // default constructor

    CheckingAccount() {

    }

    //parameter constructor to check with custom accountnumber and fee

    CheckingAccount(int accountnumber, double FEE) {
        super(accountnumber);
        FEE = FEE;
    }


    /**
     * Function to deposit fund into account as long as
     * the amount parameter is > 0
     * Apply transition fee for CheckingAccount
     */
    public void deposit(double amount) {
        //Check Amount
        if (amount > 0) {
            accountbalance += amount;
            System.out.println("amount deposit" + amount);

            //applying transition fee

            accountbalance -= FEE;
            System.out.println("transition fee is" + FEE);
            System.out.println("Available balance is " + accountbalance);

        } else {
            System.out.println("Negative amount cant be deposit");
        }
    }


    /**
     * Function to withdraw funds from the Account as long as
     * 1. Amount to withdraw must be > 0
     * 2. Amount to withdraw must be <= balance
     */

    public void withdraw(double amount) {
        if (amount > 0) {
            if ((amount + FEE) <= accountbalance) {
                System.out.println("withdraw Successful" + amount);
                accountbalance -= amount;
                accountbalance -= FEE;
                System.out.println("Fee applied Successful" + amount);
                System.out.println("Available balance is " + accountbalance);
            }
            System.out.println("withdraw Successful" + amount);

        } else {
            System.out.println("Negative Balance can't withdraw!");
        }

    }
}
