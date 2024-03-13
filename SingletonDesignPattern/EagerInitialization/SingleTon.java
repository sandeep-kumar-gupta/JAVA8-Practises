package SingletonDesignPattern.EagerInitialization;


// Eager Initialization -
public class SingleTon {
    private static final SingleTon INSTANCE = new SingleTon();
    private SingleTon(){
    }
    public static SingleTon getInstance(){
        return INSTANCE;
    }
}
