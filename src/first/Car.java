package first;

public class Car {

    private final int numberOfSeats;
    private final int numberOfDoors;
    private final String colour;

    public Car(int numberOfSeats, int numberOfDoors, String colour) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public static Car newInstance(int numberOfSeats, int numberOfDoors, String colour) {
        return new Car(numberOfSeats, numberOfDoors, colour);
    }

    public static Car newRedCar(int numberOfSeats, int numberOfDoors) {
        return new Car(numberOfSeats, numberOfDoors, "Red");
    }

    public static Car newTypicalCar() {
        return new Car(5, 4, "Grey");
    }

    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberOfDoors=" + numberOfDoors +
                ", colour='" + colour + '\'' +
                '}';
    }
}
