package SingletonDesignPattern.BreakingUsingSerialization;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static final long serialVersionUID = 1572047186439895061L;

    private static Singleton INSTANCE = null;

    private Singleton() {
    }


    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
//prevention from breaking
    private Object readResolve(){
        return getInstance();
    }

}
