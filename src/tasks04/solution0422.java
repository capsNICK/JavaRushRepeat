package tasks04;

import java.util.Scanner;

public class solution0422 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int banki = console.nextInt();
        int ludi = console.nextInt();

        double raspred = banki * 1.0 / ludi;
        System.out.println(raspred);
    }
}
