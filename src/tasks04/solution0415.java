package tasks04;

import java.util.Scanner;

public class solution0415 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (console.hasNextInt()) {
                int data = console.nextInt();
                sum += data;
            }
        }
        sum = sum / 5;
        System.out.println(sum);
    }
}
