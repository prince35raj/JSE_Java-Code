package BankAccount;

//Parent Class
//Abstract Class

public abstract class Account {
    private int accountnumber;
    protected double accountbalance;


    public Account() {

    }

    public Account(int accountnumber) {
        this.accountnumber = accountnumber;
        accountbalance = 0;
    }

    //greeters


    public double getAccountbalance() {
        return this.accountbalance;
    }

    public int getAccountnumber() {
        return this.accountnumber;
    }

    // abstract

    /**
     * Function to deposit fund into account as long as
     * the amount parameter is > 0
     * <p>
     * Apply transition fee for CheckingAccount
     */
    public abstract void deposit(double amount);

    /**
     * Function to withdraw funds from the Account as long as
     * 1. Amount to withdraw must be > 0
     * 2. Amount to withdraw must be <= balance
     */

    public abstract void withdraw(double amount);
}
