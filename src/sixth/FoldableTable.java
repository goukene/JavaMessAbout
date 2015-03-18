package sixth;

public class FoldableTable extends Table {

    private boolean legsFolded;

    public FoldableTable(int numberOfLegs, String colour, boolean legsFolded) {
        //first thing this must do is call parent constructor
        super(numberOfLegs, colour);  // call to parent(Table) constructor


        this.legsFolded = legsFolded;
    }

    public boolean isLegsFolded() {
        return legsFolded;
    }

    @Override
    public String toString() {
        return "FoldableTable{" +
                "legsFolded=" + legsFolded +
                '}';
    }
}
