package sixth;

public class Table {   //parent class, basics of inheritance.
    private int numberOfLegs;
    private String colour;

    public Table(int numberOfLegs, String colour) {
        if (numberOfLegs <= 0 || numberOfLegs > 10) {  //basic validation
            numberOfLegs = 4;
        }

        this.numberOfLegs = numberOfLegs;
        this.colour = colour;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getColour() {
        return colour;
    }

    private void silly() {
        System.out.println("Silly");
    }
}
