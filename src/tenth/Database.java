package tenth;

import seventh.menu.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Database {

    private Map<Integer, Person> employeeDatabase = new HashMap<Integer, Person>();

    public void addEmployee(int id, String name, int age, String gender) {

        Person newEmployee = new Person(name, id, age, gender);

        employeeDatabase.put(id, newEmployee);
    }

    public Person findEmployee(int id) {
        Person person = employeeDatabase.get(id);

        return person;
    }

    public void displayAllData() {
        Set<Integer> keys = employeeDatabase.keySet();

        for (Integer key : keys) {
            Person person = employeeDatabase.get(key);

            System.out.println(person);
        }


    }

    public static void main(String[] args) {
        Database db = new Database();

        db.addEmployee(1, "Ryu", 25, "M");
        db.addEmployee(2, "Ken", 26, "M");
        db.addEmployee(3, "Chun Li", 30, "F");
        db.addEmployee(4, "Akuma", 99, "M");


//        Person employee = db.findEmployee(2);
//        System.out.println(employee);

        db.displayAllData();
    }
}
