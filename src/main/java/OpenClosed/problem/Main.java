package OpenClosed.problem;

public class Main {

    private static VehicleTypeEnum vehicleTypeEnum;

    public static void main(String args[]) {

        vehicleTypeEnum = VehicleTypeEnum.CAR;

        if (vehicleTypeEnum == VehicleTypeEnum.CAR) {
            Vehicle vehicle = new Vehicle("civic", "2019");
            vehicle.createCar();
        }
        else if (vehicleTypeEnum == VehicleTypeEnum.MOTORCYCLE) {
            Vehicle vehicle = new Vehicle("Yamaha", "2010");
            vehicle.createMotorcycle();
        }

    }
}
