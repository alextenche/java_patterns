package model;

public class RudicicaCheeseHamburger extends Hamburger {

    public RudicicaCheeseHamburger() {
        name = "Rudicica Cheese Hamburger";
        sauce = "spicy";
        buns = "cookie dough buns";
    }

    @Override
    public void cook() {
        System.out.println("--> cooking Rudicica style");
    }
}
