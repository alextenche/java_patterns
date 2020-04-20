public class DuckSimulator {

    public static void main(String[] args) {

        // duck test
        Duck duck = new MallardDuck();
        testDuck(duck);

        // turkey test
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
