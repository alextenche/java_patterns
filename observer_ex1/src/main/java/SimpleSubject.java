import java.util.ArrayList;

public class SimpleSubject implements Subject {

    private ArrayList<Observer> observers;
    private int value = 0;

    public SimpleSubject() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        System.out.println("add observer to the list");
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        System.out.println("remove observer to the list");
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(value);
        }
    }

    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
}
