public class SingletonDCL {

    private volatile static SingletonDCL uniqueInstance = new SingletonDCL();
    String name;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {

        if (uniqueInstance == null) {

            synchronized (SingletonDCL.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDCL();
                }
            }

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
