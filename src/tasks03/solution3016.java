package tasks03;

import java.util.Scanner;

public class solution3016 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word1 = console.nextLine();
        String word2 = console.nextLine();

        if (word1.equals(word2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");

    }
}
