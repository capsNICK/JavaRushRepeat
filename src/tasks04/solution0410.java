package tasks04;

import java.util.Scanner;

public class solution0410 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = 0;

        while (console.hasNextInt()) {
            int input = console.nextInt();
            if ((input % 2) ==0 && input > max) {
                max = input;
            }
        }
        System.out.println(max);
    }
}
