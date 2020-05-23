public class Main {

    public static void main(String[] args) {

        SingletonLazzy singletonLazzy = SingletonLazzy.getInstance();
        SingletonLazzy secondSingletonLazzy = SingletonLazzy.getInstance();
        singletonLazzy.setName("Example Class Lazzy");
        System.out.println(singletonLazzy);
        System.out.println(secondSingletonLazzy);

        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager secondSingletonEager = SingletonEager.getInstance();
        singletonEager.setName("Example Class Eager");
        System.out.println(singletonEager);
        System.out.println(secondSingletonEager);

        SingletonDCL singletonDCL = SingletonDCL.getInstance();
        SingletonDCL secondSingletonDCL = SingletonDCL.getInstance();
        singletonDCL.setName("Example Class Double Check Locking");
        System.out.println(singletonDCL);
        System.out.println(secondSingletonDCL);

    }
}
