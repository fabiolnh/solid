package OpenClosed.solution.example1.withExtension;

import OpenClosed.solution.example1.withExtension.common.BaseVehicle;

public class Car extends BaseVehicle {

    private int seats;

    public Car(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        configureCar();
    }

    public void configureCar() {
        System.out.printf("creating a Car with color: %s, year: %s, engine: %s, with %s seats \n", color, year, engine, seats);
        startVehicle();
    }
}
