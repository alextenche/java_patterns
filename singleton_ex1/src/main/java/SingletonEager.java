public class SingletonEager {

    private static SingletonEager uniqueInstance = new SingletonEager();
    String name;

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
