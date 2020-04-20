import model.*;

public class DuckSimulator {

    public static void main(String[] args) {

        // duck test
        Duck duck = new MallardDuck();
        testDuck(duck);

        // turkey test
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);

        // drone test
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
