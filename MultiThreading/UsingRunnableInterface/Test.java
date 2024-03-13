package MultiThreading.UsingRunnableInterface;

import javax.jws.Oneway;

public class Test {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("bina");
        System.out.println(Thread.currentThread().getName());
        UsingRunnableInterface usingRunnableInterface =  new UsingRunnableInterface();

        Thread thread = new Thread(usingRunnableInterface);

        thread.start();
        System.out.println(thread.getName());
        System.out.println(thread.isAlive());
    }
}
