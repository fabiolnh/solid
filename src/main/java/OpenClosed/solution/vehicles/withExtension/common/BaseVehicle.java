package OpenClosed.solution.vehicles.withExtension.common;

public abstract class BaseVehicle {

    protected String color;
    protected String year;
    protected double engine;

    public void startVehicle() {
        System.out.println("starting");
    }
}
