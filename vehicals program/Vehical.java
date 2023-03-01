package vehicals;

// Parent
public class Vehical {
    private double Weight;
    private double Fuel;
    private int Year;
    private String Brand;

    private String engineState;


   public Vehical()
   {};
    public Vehical(double weight, double fuel, int year, String brand) {
        setWeight(Weight);
        setFuel(Fuel);
        setYear(Year);
        setBrand(Brand);
        setEngineState("OFF");
    }

    // function
    public void start() {
        if (this.engineState == "ON") {
            System.out.println("Engine is already ON.");
        } else {
            this.setEngineState("ON");
            System.out.println("engine is ON.");
        }

    }

    public void stop() {
        if (this.engineState == "OFF") {
            System.out.println("Engine is already OFF.");
        } else {
            this.setEngineState("OFF");
            System.out.println("Engine is OFF.");
        }

    }


    //getters and setters

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        this.Weight = weight;
    }

    public double getFuel() {
        return Fuel;
    }

    public void setFuel(double fuel) {
        this.Fuel = fuel;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getEngineState() {
        return engineState;
    }

    public void setEngineState(String engineState) {
        this.engineState = engineState;
    }
}
