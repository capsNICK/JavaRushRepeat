package tasks04;

import java.util.Scanner;

public class solution0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number;
            number--;
        }
        System.out.println(sum);
    }
}
