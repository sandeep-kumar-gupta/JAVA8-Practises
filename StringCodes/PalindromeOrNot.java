package StringCodes;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class PalindromeOrNot {

    public static String palidrome(String str){

       String rev = "";

        for (int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev) ){
           return "the string is palindrome";
        }else{
            return "string is not palindrome";
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = scanner.nextLine();

        System.out.println(palidrome(s));
    }
}
