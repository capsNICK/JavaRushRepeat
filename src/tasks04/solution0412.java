package tasks04;

import java.util.Random;
import java.util.Scanner;

public class solution0412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("Программа завершена. Введенное число должно быть больше 0.");
            return;
        }
        for (int count = 1; true; count++) {
        //int count = 1;
        //while (true) {
            int randomNumber = new Random().nextInt(inputNumber + 1);
            if (inputNumber == randomNumber) {
                System.out.println("Попытка №" + count);
                break;
            }
            count++;
        }
    }
}
