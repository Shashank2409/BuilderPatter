package product.builder.impl;

import product.builder.VehicleBuilder;
import product.impl.FourWheeler;

public class FourWheelerBuilder implements VehicleBuilder {
    private String name;
    private String brand;
    private int doors;
    private int hp;
    private String color;

    public FourWheelerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public FourWheelerBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getBrand() {
        return this.brand;
    }

    public FourWheelerBuilder doors(int doors) {
        this.doors = doors;
        return this;
    }

    public int getDoors() {
        return this.doors;
    }

    public FourWheelerBuilder hp(int hp) {
        this.hp = hp;
        return this;
    }

    public int getHp() {
        return this.hp;
    }

    public FourWheelerBuilder color(String color) {
        this.color = color;
        return this;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public FourWheeler build() {
        return new FourWheeler(this);
    }
}
