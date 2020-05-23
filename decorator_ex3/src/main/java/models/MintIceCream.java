package models;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("--> adding mint ice-cream");
        return 0.65 + super.cost();
    }
}
