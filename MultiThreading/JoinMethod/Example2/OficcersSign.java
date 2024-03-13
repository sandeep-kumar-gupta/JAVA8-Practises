package MultiThreading.JoinMethod.Example2;

public class OficcersSign extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("officers takes files");
            sleep(3000);
            System.out.println("officers tasks completed");
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
