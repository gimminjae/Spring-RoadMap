package hello.core.singleton;

public class SingletonService {
    // 1. create only one object in static area.
    private static final SingletonService instance = new SingletonService();

    // 2. when get or need object instance, can select it only through this static method.
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. declares constructor as private, preventing the creation of objects using the new operator from the outside.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("Call Singleton Object Logic");
    }
}
