
package SingletonDesignPattern.BreakingUsingCloning;




public class TestBreakingUsingCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = (Singleton)s1.clone();


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
} 

