package OpenClosed.solution.example1.withInterface;

import OpenClosed.problem.example1.VehicleTypeEnum;

public class Main {

    private static VehicleTypeEnum vehicleTypeEnum;

    public static void main(String[] args) {

        vehicleTypeEnum = VehicleTypeEnum.MOTORCYCLE;

        if (vehicleTypeEnum == VehicleTypeEnum.CAR) {
            Car car = new Car("white", "2019", 2.0, 4);
        }

    }
}
