package model;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Chesse";
    }

    public double cost() {
        return pizza.cost() + 0.5;
    }
}
