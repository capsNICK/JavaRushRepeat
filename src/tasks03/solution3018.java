package tasks03;

import java.util.Scanner;

public class solution3018 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        if (word.equalsIgnoreCase(secret))
            System.out.println("доступ разрешен");
        else
            System.out.println("доступ запрещен");
    }
}
