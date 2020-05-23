import interfaces.IceCream;
import models.BasicIceCream;
import models.MintIceCream;
import models.VanillaIceCream;

public class Main {

    public static void main(String[] args) {

        IceCream iceCream = new BasicIceCream();
        System.out.println("basic ice-cream cost: " + iceCream.cost());

        VanillaIceCream vanilla = new VanillaIceCream(iceCream);
        System.out.println("vanilla ice-cream cost: " + vanilla.cost());

        MintIceCream mint = new MintIceCream(vanilla);
        System.out.println("vanilla and mint ice-cream cost: " + mint.cost());

    }
}
