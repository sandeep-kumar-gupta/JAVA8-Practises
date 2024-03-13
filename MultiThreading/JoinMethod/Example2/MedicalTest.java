package MultiThreading.JoinMethod.Example2;

public class MedicalTest extends Thread{

    @Override
    public void run() {

        try {
            System.out.println("medical test started");
            sleep(3000);
            System.out.println("medical test completed");
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
