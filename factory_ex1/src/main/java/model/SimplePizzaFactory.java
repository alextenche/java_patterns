package model;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new ChessePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
