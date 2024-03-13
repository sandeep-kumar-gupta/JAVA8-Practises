package MultiThreading.SleepMethod;

public class SleepMethod {
    public static void main(String[] args) {

        for(int i = 1; i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
