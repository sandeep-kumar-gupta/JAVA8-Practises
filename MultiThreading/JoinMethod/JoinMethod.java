package MultiThreading.JoinMethod;

public class JoinMethod extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                sleep(2000);
                System.out.println(i + ":" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod joinMethod = new JoinMethod();
        joinMethod.start();
        joinMethod.join();

        for (int i = 11; i <= 20; i++) {
            try {
                sleep(2000);
                System.out.println(i + ":" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
