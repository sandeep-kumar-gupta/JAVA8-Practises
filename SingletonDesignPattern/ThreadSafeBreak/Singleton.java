package SingletonDesignPattern.ThreadSafeBreak;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (INSTANCE == null){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

}
