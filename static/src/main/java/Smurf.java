public class Smurf {

    private String name;
    static int numPapaSmurfs = 0;

    public static Smurf createSmurf(String name) {
        if (name.equals("papa")) {
            numPapaSmurfs += 1;
            if (numPapaSmurfs > 1) {
                System.out.println("one " + name + " is already created !");
                return null;
            }
        }
        System.out.println("Creating " + name + " Smurf");
        return new Smurf(name);
    }

    private Smurf(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My name is " + name + " Smurf.");
    }

    public void eat() {
        System.out.println(name + " Smurf is eating Smurfberries.");
    }


}

