package model;

import model.Duck;
import model.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("a Mallard duck");
    }
}
