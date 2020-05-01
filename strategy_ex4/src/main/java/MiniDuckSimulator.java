import model.Duck;
import model.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuak();
        mallard.performFly();
        mallard.display();
    }
}
