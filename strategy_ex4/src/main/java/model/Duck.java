package model;

import model.FlyBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuak() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("all ducks swim");
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
