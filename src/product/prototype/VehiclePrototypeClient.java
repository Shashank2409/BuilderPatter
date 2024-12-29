package product.prototype;

import product.Vehicle;

public class VehiclePrototypeClient {
    Vehicle vehicle;

    public VehiclePrototypeClient(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle createVehicle() {
        return vehicle.clone();
    }
}
