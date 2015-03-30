package seventh.menu;

public class Screen {
    private static int NUMBER_OF_LINES_TO_CLEAR = 25;

    public static void clearScreen() {
        for (int i = 0; i < NUMBER_OF_LINES_TO_CLEAR; i++) {
            System.out.println();
        }
    }

    public static void displayBlankLines(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
}
