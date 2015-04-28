package seventh.menu;

public class Person {
    private String name;
    private int id;
    private int age;
    private String gender;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, int id, int age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return id + " -> (" + name + " , " + age + ", " + gender + ")";
    }
}
