package tasks04;

public class solution0418 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9) {
                    System.out.print(bug);
                } else if (i == 0 && j == 3) {
                    System.out.print(robot);
                } else {
                    System.out.print(land);
                }
            }
            System.out.println();
        }
    }
}

