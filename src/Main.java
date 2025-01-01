import external.AutomaticStart;
import product.Vehicle;
import product.bridge.RefuelImplementor;
import product.bridge.impl.DieselRefuelImplementor;
import product.bridge.impl.PetrolRefuelImplementor;
import product.builder.impl.FourWheelerBuilder;
import product.impl.FourWheeler;
import product.prototype.VehiclePrototypeClient;
import product.utils.Start;
import product.utils.impl.BMWStart;

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

        AutomaticStart automaticStart = new AutomaticStart();
        Start bmwStart = new BMWStart(automaticStart);

        bmwStart.start("BMW i5");

        //Bridge Pattern
        RefuelImplementor petrolRefuel = new PetrolRefuelImplementor();
        Vehicle petrolMercedes = new FourWheeler(petrolRefuel);
        petrolMercedes.refuelVehicle();

        RefuelImplementor dieselRefuel = new DieselRefuelImplementor();
        Vehicle dieselMercedes = new FourWheeler(dieselRefuel);
        dieselMercedes.refuelVehicle();
    }
}
