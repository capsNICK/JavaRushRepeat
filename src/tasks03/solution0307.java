package tasks03;

import java.util.Scanner;

public class solution0307 {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cooking = scan.nextInt()*60 + scan.nextInt();

        if (cooking < 30) {
            System.out.println(NOT_YET);
        } else if (cooking == 30) {
            System.out.println(DONE);
        } else {
            System.out.println(HORRIBLY_DONE);
        }
    }
}
