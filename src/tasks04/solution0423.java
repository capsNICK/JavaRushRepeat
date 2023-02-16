package tasks04;

import java.util.Scanner;

public class solution0423 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int veter = console.nextInt();
        double perevod = veter * 3.6;

        System.out.println(Math.round(perevod));
    }
}
