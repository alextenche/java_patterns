import model.*;

public class TenPizza {

    public static void main(String[] args) {

        Pizza pizza1 = new ThinCrustPizza();
        System.out.println(pizza1.getDescription() + " $" + pizza1.cost());

        Pizza pizza2 = new ThinCrustPizza();
        pizza2 = new Cheese(pizza2);
        System.out.println(pizza2.getDescription() + " $" + pizza2.cost());

        Pizza pizza3 = new ThickCrustPizza();
        pizza3 = new Cheese(pizza3);
        pizza3 = new Olives(pizza3);
        pizza3 = new Olives(pizza3);
        pizza3 = new Peppers(pizza3);
        System.out.println(pizza3.getDescription() + " $" + pizza3.cost());


    }
}
