package tasks03;

import java.util.Scanner;

public class solution3012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int result = numberA > numberB ? numberA : numberB;
        System.out.println(result);

    }
}
