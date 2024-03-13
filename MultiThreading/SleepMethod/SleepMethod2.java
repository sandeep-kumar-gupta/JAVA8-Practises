package MultiThreading.SleepMethod;

public class SleepMethod2 implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SleepMethod2 sleepMethod = new SleepMethod2();

        Thread thread = new Thread(sleepMethod);
        thread.start();

    }
}
