package model;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("preparing " + name);
    }

    public void bake() {
        System.out.println("baking " + name);
    }

    public void cut() {
        System.out.println("cutting " + name);
    }

    public void box() {
        System.out.println("boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
