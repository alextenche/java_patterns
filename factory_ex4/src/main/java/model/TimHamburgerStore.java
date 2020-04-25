package model;

import interfaces.HamburgerStore;

public class TimHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        System.out.println("TimStore");

        if (type.equals("cheese")) {
            return new TimCheeseHamburger();
        } else if (type.equals("greek")) {
            return new TimGreekHamburger();
        } else if (type.equals("veggie")) {
            return new TimVeggieHamburger();
        }
        return null;
    }
}
