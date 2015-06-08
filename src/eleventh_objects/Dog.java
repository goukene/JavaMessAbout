package eleventh_objects;

public class Dog extends Animal  {  //  dog IS-A animal


    public Dog() {
        super(4, "Woof");  //Calls parent constructor (Animal)
    }

    @Override
    public int getAge() {
        System.out.println("Getting dog's age...");

        return super.getAge();
    }

    @Override
    public String makeNoise() {
        return "Dog making noise: "  + getNoise();
    }
}
