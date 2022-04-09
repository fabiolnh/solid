package OpenClosed.problem;

public class Main {

    private static VehicleTypeEnum vehicleTypeEnum;

    public static void main(String args[]) {

        vehicleTypeEnum = VehicleTypeEnum.MOTORCYCLE;

        if (vehicleTypeEnum == VehicleTypeEnum.CAR) {
            Vehicle vehicle = new Vehicle("white", "2019", 2.0, 4);
            vehicle.createCar();
        }
        else if (vehicleTypeEnum == VehicleTypeEnum.MOTORCYCLE) {
            Vehicle vehicle = new Vehicle("black", "2010", 250, 1);
            vehicle.createMotorcycle();
        }

    }
}
