package models;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("--> adding vanilla ice-cream");
        return 0.75 + super.cost();
    }
}
