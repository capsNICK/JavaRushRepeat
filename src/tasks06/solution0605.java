package tasks06;

public class solution0605 {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i] % 2 != 0) {
                x += coordinates[i];
            } else {
                y += coordinates[i];
            }
        }
        System.out.println(x + ", " + y);
    }
}