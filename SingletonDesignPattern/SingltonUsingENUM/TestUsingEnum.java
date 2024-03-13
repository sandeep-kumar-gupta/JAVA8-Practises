package SingletonDesignPattern.SingltonUsingENUM;

public class TestUsingEnum {
    public static void main(String[] args) {

        Singleton s1 = Singleton.GETINSTANCE;
        Singleton s2 = Singleton.GETINSTANCE;


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String welcome = s1.welcome();
        System.out.println(welcome);

    }
} 

