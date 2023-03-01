package Exceptionpack;

import java.io.FileReader;

public class ClassB {

    int avl_amt=10000;

    void withdraw(int wd_amt)
    {
        if(avl_amt<wd_amt)
        {
            throw new RuntimeException("Balance is not sufficient");
        }
        else
        {
            System.out.println("Transaction success");
        }
    }
    void dislay() throws Exception
    {
        FileReader fr=new FileReader("C:\\Users\\Prince Henry\\Desktop\\file1.txt");
        System.out.println("display() Called");
    }

    public static void main(String[] args) throws Exception
    {
        ClassB bobj=new ClassB();
        bobj.withdraw(5000);
        System.out.println("--------------");
        bobj.dislay();
    }

}
