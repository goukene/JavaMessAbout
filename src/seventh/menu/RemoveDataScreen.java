package seventh.menu;

import java.util.List;

public class RemoveDataScreen {

    private Database database;

    public RemoveDataScreen(Database database) {
        this.database = database;
    }

    public void display() {
        Screen.clearScreen();

        Screen.displayBlankLines(3);

        int id = getIdInput();
        boolean didRemovePerson = database.removePerson(id);

        if (didRemovePerson) {
            System.out.println("        Removed person with id: " + id);
        } else {
            System.out.println("        Warning, person with id: " + id + " not found.");
        }

        Screen.displayBlankLines(3);
        System.out.println("    Hit any key to return");
        SimpleInput.getKeyboardInput();
    }

    private int getIdInput() {
        System.out.println("        Enter id of data to remove: ");
        boolean inputError = false;

        int id = -1;

        do {
            if (inputError) {
                System.out.println("        Error: please enter number: ");
            }

            String id2Remove = SimpleInput.getKeyboardInput();

            try {
                id = Integer.parseInt(id2Remove);   //convert string to integer
                inputError = false;
            } catch (NumberFormatException exc) {
                inputError = true;
            }

        } while(inputError == true);  //keep looping until inputError false

        return id;
    }

}

