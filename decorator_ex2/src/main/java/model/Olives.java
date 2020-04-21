package model;

public class Olives extends ToppingDecorator {

    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double cost() {
        return pizza.cost() + .35;
    }
}
