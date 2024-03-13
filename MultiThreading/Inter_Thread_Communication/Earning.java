package MultiThreading.Inter_Thread_Communication;

public class Earning {
    public static void main(String[] args) throws InterruptedException {


    TotalEarning totalEarning = new TotalEarning();
    totalEarning.start();
    synchronized (totalEarning){
        totalEarning.wait();
    }
        System.out.println("total Earning : "+totalEarning.total);
    }

}
