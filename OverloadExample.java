public class OverloadExample {

    void test(){
        System.out.println("no paramters");
    }
    void test(int a){
        System.out.println("a = "+a);
    }
    void test(int a, int b){
        System.out.println("a = " +a+ "b = "+b);
    }
    double test (double a){
        System.out.println(a);
        return a*a;
    }
}
