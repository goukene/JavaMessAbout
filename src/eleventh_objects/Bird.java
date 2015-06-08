package eleventh_objects;

public class Bird extends Animal {

    public Bird() {
        super(2, "Chirp");

    }

    @Override
    public void setAge(int age) {
        if (age > 0 && age < 6) {
            this.age = age;
        }
    }

    @Override
    public String makeNoise() {
        return "Bird making noise: "  + getNoise();
    }

    public String makeNoise(String newNoise) {
        return "Bird making new noise: " + newNoise;
    }
}
