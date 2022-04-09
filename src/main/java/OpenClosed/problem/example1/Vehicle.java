package OpenClosed.problem.example1;

public class Vehicle {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void createCar() {
        System.out.printf("creating a Car with color: %s, year: %s, engine: %s, with %s seats", color, year, engine, seats);
    }

    public void createMotorcycle() {
        System.out.printf("creating a motorcycle with year: %s, engine: %s cilinders", year, engine);
    }




}
