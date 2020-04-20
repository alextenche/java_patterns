package model;

public class SuperDrone implements Drone {

    public void beep() {
        System.out.println("beep beep");
    }

    public void spin_rotors() {
        System.out.println("rotors are spinning");
    }

    public void take_off() {
        System.out.println("taking off");
    }
}
