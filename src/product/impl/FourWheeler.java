package product.impl;

import product.Vehicle;
import product.bridge.RefuelImplementor;
import product.builder.impl.FourWheelerBuilder;

public class FourWheeler implements Vehicle {
    private String name;
    private String brand;
    private int doors;
    private int hp;
    private String color;
    private RefuelImplementor refuelImplementor;

    public String getName() {
        return name;
    }

    private FourWheeler() {}

    public FourWheeler(RefuelImplementor refuelImplementor) {
        this.refuelImplementor = refuelImplementor;
    }

    private FourWheeler(String name, String brand, int doors, int hp, String color) {
        this.name = name;
        this.brand = brand;
        this.doors = doors;
        this.hp = hp;
        this.color = color;
    }

    public FourWheeler(FourWheelerBuilder fourWheelerBuilder) {
        this.name = fourWheelerBuilder.getName();
        this.brand = fourWheelerBuilder.getBrand();
        this.hp = fourWheelerBuilder.getHp();
        this.doors = fourWheelerBuilder.getDoors();
        this.color = fourWheelerBuilder.getColor();
    }

    @Override
    public void refuelVehicle() {
        refuelImplementor.refuelTank();
    }

    @Override
    public FourWheeler clone() {
        return new FourWheeler(this.name, this.brand, this.doors, this.hp, this.color);
    }

    @Override
    public void drive() {
        System.out.printf("Driving a %s door %s %s %s with %s HP\n", doors, color, brand, name, hp);
    }

}
