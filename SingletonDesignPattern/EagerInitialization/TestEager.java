
package SingletonDesignPattern.EagerInitialization;

public class TestEager {
    public static void main(String[] args) {

        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

