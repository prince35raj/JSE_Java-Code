package Inheritance;

class Animal
{
    void food()
    {
        System.out.println("What kind of food do lions eat");
    }
}
   class Lion extends Animal
{
    void food1()
    {
        System.out.println("Lions eat flesh");
    }

}
public class finaltestlion extends Lion
{
    public static void main(String[] args)
    {
       Lion l1= new Lion();
       l1.food();
        l1.food1();





    }
}
