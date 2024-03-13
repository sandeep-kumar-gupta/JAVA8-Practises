
package SingletonDesignPattern.BillPugh;

public class TestBillPugh {
    public static void main(String[] args) {

        Singlton s1 = Singlton.getInstance();
        Singlton s2 = Singlton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

