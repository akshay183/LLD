public class Singleton {

    private static Singleton instanceSingleton=null;
    private Singleton() {

        System.out.println("Constructor Called");
    }

    public static Singleton getInstanceSingleTon() {

        if(instanceSingleton == null) {
            instanceSingleton = new Singleton();
        }

        return instanceSingleton;
    }
}
