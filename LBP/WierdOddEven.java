package LBP;

import java.util.Scanner;

public class WierdOddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 1 && x <= 100) {
            if (x % 2 != 0) {
                System.out.println("weired");

            } else {
                if (x >= 2 && x <= 5) {
                    System.out.println("not wierd");
                } else if (x >= 6 && x <= 20) {
                    System.out.println("wierd");
                } else  {
                    System.out.println("not wierd");
                }
            }
        } else {
            System.out.println("invalid number");
        }
    }
}
