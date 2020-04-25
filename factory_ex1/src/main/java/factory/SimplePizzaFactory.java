package factory;

import model.ChessePizza;
import model.PepperoniPizza;
import model.Pizza;
import model.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new ChessePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
