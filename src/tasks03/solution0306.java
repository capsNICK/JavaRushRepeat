package tasks03;

import java.util.Scanner;

public class solution0306 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //напишите тут ваш код
        boolean isHigh = (bodyTemperature > 37);
        boolean isLow = (bodyTemperature < 36);
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}

