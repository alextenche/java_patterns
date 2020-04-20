package model;

public interface SubjectW {

    public void registerObserver(ObserverW o);

    public void removeObserver(ObserverW o);

    public void notifyObservers();



}
