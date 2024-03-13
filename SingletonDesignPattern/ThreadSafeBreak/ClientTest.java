package SingletonDesignPattern.ThreadSafeBreak;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {
    public static void main(String[] args) {

        MyThread thread = new MyThread();

        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(5);
            executorService.execute(thread);
            executorService.execute(thread);
            executorService.execute(thread);
            executorService.execute(thread);
            executorService.execute(thread);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
