package StringCodes;

import java.util.Scanner;

public class ReverseWord {

    public static String reverseWord(String str) {

        StringBuffer stringBuffer = new StringBuffer();

        String[] s1 = str.split(" ");

        for (int i = s1.length - 1; i >= 0; i--) {

            stringBuffer.append(s1[i] + " ");
        }

        return stringBuffer.toString();

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = scanner.nextLine();

        System.out.println(reverseWord(s));
    }


}


