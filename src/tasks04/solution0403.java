package tasks04;

import java.util.Scanner;

public class solution0403 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String text = " любит меня.";
        int n = 0;

        while (n < 10) {
            System.out.println(name + text);
            n++;
        }
    }
}
