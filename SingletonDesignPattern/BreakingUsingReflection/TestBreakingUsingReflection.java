
package SingletonDesignPattern.BreakingUsingReflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class TestBreakingUsingReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;

        Constructor<?>[] constructors = new Constructor[]{Singleton.class.getDeclaredConstructor()};

        for (Constructor<?> constructor:constructors){
            constructor.setAccessible(true);
            Object object = constructor.newInstance();
            s2 = (Singleton) object;
            break;
        }

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
} 

