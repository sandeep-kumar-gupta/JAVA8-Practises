package CustomException;


public class MyClass {
    public static String CHECK = "yaar tu h ";
    public static void main(String[] args) {

        try {
            if (CHECK.contains("yaar")) {
                throw new MyException("haa m hu ");
            }
        } catch (MyException myException) {

            System.out.println(myException.getMessage());
        }


    }
}
