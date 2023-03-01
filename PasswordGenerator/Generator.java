package PasswordGenerator;
import java.util.Objects;

import java.util.Scanner;
/*
public class Generator 
{
    Alphabet alphabet;
    
    public static Scanner keyboard;
    
    public Generator(Scanner scanner)
    {
        keyboard=scanner;
    }


    public Generator(boolean IncludeUpper,boolean IncludeLower,boolean IncludeNum,boolean IncludeSym) 
    {
        alphabet=new Alphabet(IncludeUpper,IncludeLower,IncludeNum,IncludeSym);
    }
    public void mainLoop()
    {
        System.out.println("Welcome to Password Services:");
        printMenu();
        
        String userOption="-1";
        while(!userOption.equals("4"))
        {
            userOption=keyboard.next();
            
            switch(userOption)
            {
                case "1"->
                {
                 //   requestPassword();
                    printMenu();
                }
                case "2"->
                {
               //    checkPassword();
                    printMenu();
                }
                case "3"->
                {
                    printMenu();
                }
                case "4"->
                {
                    System.out.println();
                    System.out.println("kindly select one of the avilable commands");
                }
            }
        }
    }
    private Password GeneratePassword(int lenght)
    {
        final StringBuilder pass=new StringBuilder("");

        final int alphabateLenght=alphabet.getAlphabet().length();

        int max=alphabateLenght-1;
        int min=0;
        int range=max-min+1;

        for(int i=0;i<lenght;i++)
        {
            int index=(int)(Math.random()*range)+min;
            pass.append(alphabet.getAlphabet().charAt(index));
        }
        return new Password(pass.toString());
    }

    private void printMenu()
    {

    }
}*/
