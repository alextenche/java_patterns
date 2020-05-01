import controller.CreditCardAlgorithm;
import controller.PayPalAlgorithm;
import controller.ShoppingCart;
import model.Product;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product shoes = new Product("1234", 25);
        Product shirt = new Product("2345", 12);

        cart.addProduct(shoes);
        cart.addProduct(shirt);

        cart.pay(new PayPalAlgorithm("alex@gmail.com", "pass1234"));
        cart.pay(new CreditCardAlgorithm("Alex", "12345678"));
    }
}
