package vehicals;

public class Car extends Vehical
{
    public Car()
    {
        System.out.println("A new Car has been instantiated");
    }

    public Car(double weight, double fuel, int year, String brand)
    {

        this.setWeight(weight);
        this.setFuel(fuel);
        this.setYear(year);
        this.setBrand(brand);
    //    super( weight,fuel,year,brand);
    }
    public String toString()
    {
        String str= "Brand:" +super.getBrand();
        str +="\nYear:" +super.getYear();
        str +="\nWeight:"+super.getWeight();
        str +="\nFuel:"+super.getFuel();
        str +="\nEngine State:" +super.getEngineState();
        return str;

    }

}
