package models;

import interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("--> creating a basic ice-cream");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
