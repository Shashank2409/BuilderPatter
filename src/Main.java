import product.Vehicle;
import product.builder.impl.FourWheelerBuilder;
import product.prototype.VehiclePrototypeClient;

public class Main {
    public static void main(String args[]) {
        FourWheelerBuilder fourWheelerBuilder = new FourWheelerBuilder();
        fourWheelerBuilder.brand("BMW");
        fourWheelerBuilder.doors(5);
        fourWheelerBuilder.color("Black");
        fourWheelerBuilder.hp(500);
        fourWheelerBuilder.name("i5");
        Vehicle bmw = fourWheelerBuilder.build();

        bmw.drive();

        VehiclePrototypeClient vehiclePrototypeClient = new VehiclePrototypeClient(bmw);
        Vehicle anotherBmw = vehiclePrototypeClient.createVehicle();
        anotherBmw.drive();

    }
}
