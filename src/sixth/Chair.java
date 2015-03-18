package sixth;

public class Chair {
    private int numberOfLegs;
    private String colour;

    public Chair(int numberOfLegs, String colour) {
        this.numberOfLegs = numberOfLegs;
        this.colour = colour;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "numberOfLegs=" + numberOfLegs +
                ", colour='" + colour + '\'' +
                '}';
    }
}
