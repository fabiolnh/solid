package OpenClosed.solution.vehicles.withExtension;

import OpenClosed.problem.VehicleTypeEnum;

public class Main {

    private static VehicleTypeEnum vehicleTypeEnum;

    public static void main(String[] args) {

        vehicleTypeEnum = VehicleTypeEnum.MOTORCYCLE;

        if (vehicleTypeEnum == VehicleTypeEnum.CAR) {
            Car car = new Car("white", "2019", 2.0, 4);
        }
        else if (vehicleTypeEnum == VehicleTypeEnum.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("black", "2010", 250, 1);
        }

    }
}
