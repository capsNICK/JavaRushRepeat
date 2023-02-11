package tasks04;

import java.util.Scanner;

public class solution0407 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word;

        while (true) {
            word = console.nextLine();
            if (word.equalsIgnoreCase("enough")) {
                break;
            } else {
                System.out.println(word);
            }
        }
    }
}
