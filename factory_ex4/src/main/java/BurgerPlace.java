import interfaces.HamburgerStore;
import model.Hamburger;
import model.RudicicaHamburgerStore;
import model.TimHamburgerStore;

public class BurgerPlace {

    public static void main(String[] args) {

        HamburgerStore rudicicaStore = new RudicicaHamburgerStore();
        HamburgerStore timStore = new TimHamburgerStore();

        Hamburger hamburger1 = rudicicaStore.orderHamburger("cheese");
        System.out.println(hamburger1.getName());

        Hamburger hamburger2 = timStore.orderHamburger("greek");
        System.out.println(hamburger2.getName());

    }
}
