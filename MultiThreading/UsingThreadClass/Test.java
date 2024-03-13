package MultiThreading.UsingThreadClass;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        UsingThreadClass usingThreadClass = new UsingThreadClass();
        usingThreadClass.start();
        System.out.println("currnt thread name : ");
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
    }
}
