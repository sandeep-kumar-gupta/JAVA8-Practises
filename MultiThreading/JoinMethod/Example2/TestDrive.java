package MultiThreading.JoinMethod.Example2;

public class TestDrive extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("Test drive started");
            sleep(5000);
            System.out.println("test drive completed");
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
