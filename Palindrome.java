public class Palindrome {

    public static void main(String[] args) {

        String str = "amma";
        String reverseStr = "";

        for (int i = str.length()-1;i>=0;i--){
            reverseStr = reverseStr+str.charAt(i);
        }
        System.out.println(reverseStr);

        if (str.equals(reverseStr)){
            System.out.println("palidrome");

        }else {
            System.out.println("not palindrome");
        }

    }

}
