package vehicals;

public class MainProgram {
    private static Car car;
    private static Plane plane;

    public static void main(String[] args) {

        car = new Car(2500,35,2018,"mini cooper");
        plane = new Plane(1500000,2000,2017,"Boeing",120);

        car.start();
        plane.start();

        System.out.println("----------------------------");

        System.out.println(car);
        System.out.println("----------------------------");
        System.out.println(plane);

    }
}
