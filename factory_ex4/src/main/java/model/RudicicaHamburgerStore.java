package model;

import interfaces.HamburgerStore;

public class RudicicaHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        System.out.println("RudicicaStore");

        switch (type) {
            case "cheese":
                return new RudicicaCheeseHamburger();
            case "greek":
                return new RudicicaGreekHamburger();
            case "veggie":
                return new RudicicaVeggieHamburger();
        }
        return null;
    }
}
