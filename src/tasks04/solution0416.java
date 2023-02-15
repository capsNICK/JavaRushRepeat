package tasks04;

import java.util.Scanner;

public class solution0416 {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int s;

        do {
            s = bombInterface.nextInt();
            System.out.println(s);
        } while ((s % 10) == 0);
    }
}
