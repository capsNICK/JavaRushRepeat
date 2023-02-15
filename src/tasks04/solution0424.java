package tasks04;

import java.util.Scanner;

public class solution0424 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean i = console.nextBoolean();
        double glass = 0.5;


        if (i) {
            System.out.println((int) Math.ceil(glass));
        } else {
            System.out.println((int) Math.floor(glass));
        }
    }
}
