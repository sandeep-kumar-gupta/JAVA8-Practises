public class TestOverLoad {

    public static void main(String[] args) {


        OverloadExample oe = new OverloadExample();

        double result;
        oe.test();
        oe.test(10);
        oe.test(10,20);
        result = oe.test(10.0);
        System.out.println("result of test(10) " +result);

    }

}
