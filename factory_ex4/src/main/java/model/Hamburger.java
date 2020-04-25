package model;

public abstract class Hamburger {

    String name;
    String sauce;
    String buns;

    public void prepare() {
        System.out.println("--> preparing " + name);
        System.out.println("--> adding sauce " + sauce);
        System.out.println("--> adding buns " + buns);
    }

    public void cook() {
        System.out.println("--> cooking");
    }

    public void box() {
        System.out.println("--> boxing");
    }

    public String getName() {
        return name;
    }
}
