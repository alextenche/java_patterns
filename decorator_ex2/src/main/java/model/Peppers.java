package model;

public class Peppers extends ToppingDecorator {

    Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Peppers";
    }

    public double cost() {
        return pizza.cost() + .2;
    }
}
