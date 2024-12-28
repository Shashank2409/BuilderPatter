package product.impl;

import product.Vehicle;
import product.builder.impl.FourWheelerBuilder;

public class FourWheeler implements Vehicle {
    private String name;
    private String brand;
    private int doors;
    private int hp;
    private String color;

    private FourWheeler() {}

    public FourWheeler(FourWheelerBuilder fourWheelerBuilder) {
        this.name = fourWheelerBuilder.getName();
        this.brand = fourWheelerBuilder.getBrand();
        this.hp = fourWheelerBuilder.getHp();
        this.doors = fourWheelerBuilder.getDoors();
        this.color = fourWheelerBuilder.getColor();
    }

    public void drive() {
        System.out.printf("Driving a %s door %s %s %s with %s HP", doors, color, brand, name, hp);
    }

}
