package OpenClosed.problem;

public class Vehicle {

    private String color;
    private String year;
    private String engine;
    private String seats;

    public Vehicle(String color, String year) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.year = seats;
    }

    public void createCar() {
        System.out.printf("creating a Car with color: %s, year: %s, engine: %s, with %s seats", color, year, engine, seats);
    }

    public void createMotorcycle() {
        System.out.printf("creating a motorcycle with year: %s, engine: %s cilinders", year, engine);
    }

    public void start() {
        System.out.println("starting");
    }


}
