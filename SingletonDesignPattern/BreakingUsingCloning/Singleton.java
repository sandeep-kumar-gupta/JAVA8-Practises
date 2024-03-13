package SingletonDesignPattern.BreakingUsingCloning;

public class Singleton implements Cloneable{
    private static Singleton INSTANCE = null;

    private Singleton() {
    }



    public static Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
//prevention from breaking
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("you cannot clone singleton class");
    }
}
