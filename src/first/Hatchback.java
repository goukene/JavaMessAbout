package first;

public class Hatchback extends Car {

    public Hatchback(String colour) {
        this(3, colour);
    }

    public Hatchback(int numberOfDoors, String colour) {
        super(4, numberOfDoors, colour);
    }

    public static void main(String[] args) {
        Car green = new Hatchback("Green");

        Hatchback blue = new Hatchback(5, "Blue");

        System.out.println(green);
        System.out.println(blue);
    }
}
