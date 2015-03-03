package fourth;

public class Cat {
    private String hairLength;
    private String name;
    private int id;


    //Constructor
    //   no return type name-matches
    public                 Cat(String hairLength, String name, int id) {
        this.hairLength = hairLength;
        this.name = name;
        this.id = id;
    }


    // no-argument constructor
    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hairLength='" + hairLength + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
