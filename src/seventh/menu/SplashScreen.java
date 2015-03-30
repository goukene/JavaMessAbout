package seventh.menu;

public class SplashScreen {

    public void display() {
        Screen.clearScreen();

        System.out.println("/-------------------------------------------------------\\");
        for (int i = 0; i < 5; i++) {
            System.out.println("|                                                       |");
        }

        System.out.println("|            My Java Database Input Program             |");

        for (int i = 0; i < 5; i++) {
            System.out.println("|                                                       |");
        }

        System.out.println("\\-------------------------------------------------------/");
    }

}
