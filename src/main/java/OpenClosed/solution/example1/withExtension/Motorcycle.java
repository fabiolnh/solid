package OpenClosed.solution.example1.withExtension;

import OpenClosed.solution.example1.withExtension.common.BaseVehicle;

public class Motorcycle extends BaseVehicle {

    public Motorcycle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        configureCar();
    }

    public void configureCar() {
        System.out.printf("creating a Car with color: %s, year: %s, engine: %s \n", color, year, engine);
        startVehicle();
    }

}
