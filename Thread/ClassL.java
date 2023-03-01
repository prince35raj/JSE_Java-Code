package Thread;

public class ClassL {

    int amount=10000; // instance variable

    synchronized void with_draw(int amount) throws InterruptedException
    {
        if(this.amount<amount) //10000<15000
        {
            System.out.println("Insufficient Balance");
            wait();
            System.out.println("amount credited");
            this.amount-=amount; //20000-15000=5000
            System.out.println("with draw successful \nBalance is "+this.amount); //5000
        }
         else
        {
            this.amount-=amount; //10000-6000=4000
            System.out.println("with draw successful \nBalance is" +this.amount);//4000
        }
    }
    synchronized void deposit(int amount) //10000
    {
        this.amount+=amount; // 10000+10000=20000
        System.out.println("deposit successful \nBalance is "+this.amount);//20000
        notify();
        notifyAll();
    }

}
