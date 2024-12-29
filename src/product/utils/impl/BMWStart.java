package product.utils.impl;

import external.AutomaticStart;
import product.utils.Start;

public class BMWStart implements Start {
    AutomaticStart automaticStart;

    public BMWStart(AutomaticStart automaticStart) {
        this.automaticStart = automaticStart;
    }

    @Override
    public void start(String name) {
        System.out.println("Starting BMW");
        automaticStart.startCar(name);
    }
}
