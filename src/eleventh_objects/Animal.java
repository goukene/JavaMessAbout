package eleventh_objects;

public class Animal {

    protected int age;  // HAS-A
    private int numLegs;
    private final String noise;

    public Animal(int numLegs, String noise) {
        this.numLegs = numLegs;
        this.noise = noise;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getNumLegs() {
        return numLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", numLegs=" + numLegs +
                '}';
    }

    public String makeNoise() {
        return "Animal: " + noise;
    }

    public String getNoise() {
        return noise;
    }
}
/*
            Object
              |
            Animal
              /\
             /  \
           Dog   Bird


 */