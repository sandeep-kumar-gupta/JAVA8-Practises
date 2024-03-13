package MultiThreading.YieldMethod;

public class YieldMethod extends  Thread{

    @Override
    public void run() {
        for (int i = 1; i<=10;i++){
            System.out.println(i+" :"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        YieldMethod yieldMethod = new YieldMethod();
        yieldMethod.start();
        Thread.yield();
        for (int i = 1; i<=15;i++){
            System.out.println(i+" :"+Thread.currentThread().getName());

        }
    }
}
