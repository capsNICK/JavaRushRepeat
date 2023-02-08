package tasks03;

import java.util.Scanner;

public class solution0303 {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner consoleName = new Scanner(System.in);
        Scanner consoleAge = new Scanner(System.in);
        String name = consoleName.nextLine();
        int age = consoleAge.nextInt();

        if (age >= 18)
            if (age <= 28) {
                System.out.println(name + militaryCommissar);
            }

    }
}
