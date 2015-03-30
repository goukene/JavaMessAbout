package seventh.menu;

public class DbInputProgram {

    private Database db = new Database();

    private MainMenu mainMenu = new MainMenu(db);
    private DisplayDataScreen dataScreen = new DisplayDataScreen(db);
    private RemoveDataScreen removeDataScreen = new RemoveDataScreen(db);
    private EnterDataScreen entryDataScreen = new EnterDataScreen(db);

    public void run() {
        new SplashScreen().display();
        delay(2);
        Screen.clearScreen();

        while(true) {
            String choice = mainMenu.getChoice();

            if ("q".equalsIgnoreCase(choice)) {
                System.out.println("User quit.");
                break;     //exit loop when user enters 'q' or 'Q' for quit.
            } else if ("d".equalsIgnoreCase(choice)) {
                dataScreen.display();
            } else if ("r".equalsIgnoreCase(choice)) {
                removeDataScreen.display();
            } else if ("e".equalsIgnoreCase(choice)) {
                entryDataScreen.display();
            }
        }
    }

    private void delay(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DbInputProgram().run();
    }
}
