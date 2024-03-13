package MultiThreading.DaemonThread;

public class DaemonThread implements Runnable{

    @Override
    public void run() {

        System.out.println("the thread is daemon");
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        DaemonThread daemonThread = new DaemonThread();
        Thread thread = new Thread(daemonThread);
        thread.setDaemon(true);
        thread.getName();

    }
}
