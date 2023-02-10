package tasks04;

import java.util.Scanner;

public class solution0404 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int sum = 0;
        boolean exit = false;


        while (!exit) {
            sum = sum + num;
            String enter = console.nextLine();
            exit = enter.equalsIgnoreCase("enter");
        }
        System.out.println(sum);

    }
}
