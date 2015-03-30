package seventh.menu;

public class EnterDataScreen {
    private Database db;

    public EnterDataScreen(Database db) {
        this.db = db;
    }

    public void display() {
        Screen.clearScreen();

        Screen.displayBlankLines(3);

        System.out.println("        Enter person's name: ");
        String name = SimpleInput.getKeyboardInput();

        db.addPerson(name);

        Screen.displayBlankLines(2);
        System.out.println(name + " added to database.");
    }
}
