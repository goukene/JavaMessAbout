package first;

public class Hatchback extends Car {

    public Hatchback(String colour) {
        super(4, 2, colour);
    }

    public String toString() {
        return "Hatchback{" +
                "numberOfSeats=" + getNumberOfSeats() +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", colour='" + getColour() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Hatchback green = new Hatchback("Green");


        System.out.println(green);
    }
}
