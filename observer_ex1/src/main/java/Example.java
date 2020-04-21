public class Example {

    public static void main(String[] args) {

        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(10);
        simpleSubject.setValue(20);
    }
}
