package BankAccount;
// Savings Account child class
// has an interest rate
// a method to apply interest - profit

public class SavingAccount extends Account {
    private static double Interest;

    //default constructor

    SavingAccount() {
        super();
    }

    /**
     * Parameter constructor to intialize Savings account with a customer account
     * number and interest rate
     */

    SavingAccount(int accountnumber, double insertrate) {
        super(accountnumber);
        this.Interest = Interest;
    }

    public double getInterest() {
        return Interest;
    }

    public void setInterest(double Interest) {
        this.Interest = Interest;
    }

    public double calcInterest() {
        return accountbalance * Interest;
    }

    public void applyInterest() {
        double interest = calcInterest();
        System.out.println(+interest);
        deposit(interest);
    }

    /*
     ** function to deposit fund in account amount parameter > 0
     */

    public void deposit(double amount) {
        if (amount > 0) {
            accountbalance += amount;
            System.out.println(+amount);
            System.out.println(+accountbalance);
        }

    }

    /*
     ** Function withdraw amount in to account amount parameter>0
     */
    public void withdraw(double amount) {
        // same check
        if (amount > 0) {
            // Check sufficient balance

            if ((amount) <= accountbalance) {
                System.out.println(+amount);
                accountbalance -= amount;
                System.out.println(+accountbalance);
            }
        } else {
            System.out.println("negative balance can't withdraw");
        }


    }
}
