package tasks03;

import java.util.Scanner;

public class solution0308 {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        boolean triangle = (a < b + c) && (b < a + c) && (c < a + b);

        if (triangle)
            System.out.println(TRIANGLE_EXISTS);
        else
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
