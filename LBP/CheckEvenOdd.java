package LBP;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        if (x >= 0) {
            if (x % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }
        }
        else {
            System.out.println("number is invalid");
        }
    }
}
