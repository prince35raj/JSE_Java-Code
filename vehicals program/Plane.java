package vehicals;

public class Plane extends Vehical
{
    private double wingspan;
    public Plane()
    {

        System.out.println("A new plan has been instantiated");
    }

    public Plane(double weight, double fuel, int year, String brand,double wingspan)
    {
        this.setWeight(weight);
        this.setFuel(fuel);
        this.setYear(year);
        this.setBrand(brand);
        // super( weight, fuel, year,brand);
        this.setWingspan(wingspan);
    }
    public String toString(){
        String str= "Brand:" +super.getBrand();
        str +="\nYear:" +super.getYear();
        str +="\nWeight:"+super.getWeight();
        str +="\nFuel:"+super.getFuel();
        str +="\nEngine State:" +super.getEngineState();
        str +="\n wingspan:" +this.getWingspan();
        return str;
    }


    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

}
