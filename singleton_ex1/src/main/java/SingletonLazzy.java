public class SingletonLazzy {

    private static SingletonLazzy uniqueInstance;
    String name;

    private SingletonLazzy() {
    }

    public static synchronized SingletonLazzy getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazzy();

        }

        return uniqueInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
