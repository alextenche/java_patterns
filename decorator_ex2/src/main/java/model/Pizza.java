package model;

public abstract class Pizza {

    String description = "unknown pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
