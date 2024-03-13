package StringCodes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static String removeDuplicates(String str){

        Set<Character> set = new HashSet<>();
        StringBuffer  stringBuffer =  new StringBuffer();
        for (int i = 0;i<str.length();i++){

            Character c =  str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                stringBuffer.append(c);
            }


        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string ");
        String string = scanner.next();
        System.out.println(removeDuplicates(string));

    }
}
