package OpenClosed.solution.vehicles.withInterface;

import OpenClosed.solution.vehicles.withInterface.common.IVehicleCar;

public class Car implements IVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;


    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.printf("Creating a car (with interface). color: %s, engine: %s \n", color, engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("starting (with interface)");
    }
}
