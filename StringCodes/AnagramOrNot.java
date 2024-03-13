package StringCodes;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {

    public static String anagram(String str1, String str2) {

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if (Arrays.equals(char1, char2)) {
            return "String are anagram";
        } else {
            return "string are not anagarm";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(anagram(s1, s2));
    }
}
