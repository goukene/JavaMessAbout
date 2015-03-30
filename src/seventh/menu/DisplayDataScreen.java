package seventh.menu;

import java.util.List;

public class DisplayDataScreen {

    private Database database;

    public DisplayDataScreen(Database database) {
        this.database = database;
    }

    public void display() {
        Screen.clearScreen();

        List<Person> personList = database.getAllData();

        if (personList.isEmpty()) {
            System.out.println("No data exists.");
        } else {

            for (Person person : personList) {
                System.out.println(person);
            }
        }

        Screen.displayBlankLines(3);
        System.out.println("Hit any key to return");
        SimpleInput.getKeyboardInput();
    }

}
