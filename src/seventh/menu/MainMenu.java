package seventh.menu;

public class MainMenu {

    private Database db;

    public MainMenu(Database db) {
        this.db = db;
    }

    public String getChoice() {
        Screen.clearScreen();

        displayChoices();

        String usersKeyboardInput = SimpleInput.getKeyboardInput();

        return usersKeyboardInput;
    }

    private void displayChoices() {
        Screen.displayBlankLines(5);

        System.out.println("            (D)isplay all data.");
        System.out.println("            (E)nter new entry.");
        System.out.println("            (R)emove entry");
        System.out.println("            (Q)uit.");

        Screen.displayBlankLines(5);
        System.out.println("                                    [" + db.getDbSize() + " records in db]");
    }
}
