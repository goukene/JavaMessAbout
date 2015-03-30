package seventh.menu;

import java.util.*;

public class Database {

    private Map<Integer, Person> db = new HashMap<Integer, Person>();
    private int id = 1;

    public void addPerson(String personName) {
        Person newPerson = new Person(personName, id++);

        db.put(newPerson.getId(), newPerson);
    }

    public Person findPerson(int id) {
        for (Integer idInDb : db.keySet()) {
            if (id == idInDb) {
                return db.get(id);
            }
        }

        return null;
    }

    public boolean removePerson(int id) {
        Person removedPerson = db.remove(id);

        return removedPerson != null;   // return true if person not null, i.e. person was in DB, else return false
    }

    public int getDbSize() {
        return db.size();
    }

    public List<Person> getAllData() {
        return new ArrayList<Person>(db.values());
    }
}
