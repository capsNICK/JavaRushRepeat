package tasks04;

import java.util.Scanner;

public class solution0421 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        double pi = 3.14;
        double s = pi * radius * radius;
        System.out.println((int)s);
    }
}
