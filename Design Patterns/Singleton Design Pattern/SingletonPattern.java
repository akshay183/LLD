import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonPattern {

    public static void main(String[] args) {

//        Singleton singleton = Singleton.getInstanceSingleTon();
//        Singleton singleton1 = Singleton.getInstanceSingleTon();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            Singleton singleton = Singleton.getInstanceSingleTon();
            System.out.println(singleton);
        };

        executorService.submit(task);
        executorService.submit(task);
    }
}
