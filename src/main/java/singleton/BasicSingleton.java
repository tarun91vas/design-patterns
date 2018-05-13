package singleton;

public class BasicSingleton {
    private static BasicSingleton singleton;
    private static int id;

    private BasicSingleton() {
        id = id + 1;
        System.out.println("Instance created");
    }

    public static BasicSingleton getInstance() {
        if (singleton == null) {
            singleton = new BasicSingleton();
        }
        System.out.println("Instance id:" + id);
        return singleton;
    }

    public static void main(String[] args) {
        //first call
        BasicSingleton obj1 = BasicSingleton.getInstance();

        //second call
        BasicSingleton obj2 = BasicSingleton.getInstance();

    }

}
