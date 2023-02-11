package tasks04;

import java.util.Scanner;

public class solution0406 {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);
    }
    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        while (true) {
            inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Загадочное число равно " + number);
                break;
            } else {
                System.out.println("Попробуй еще раз");
            }
        }
    }
}
