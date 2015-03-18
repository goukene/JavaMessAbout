package sixth;

import java.util.Arrays;

public class Room {
    private FoldableTable table;
    private Chair [] chairs;


    public Room(FoldableTable table, Chair[] chairs) {
        this.table = table;
        this.chairs = chairs;
    }

    public Room(FoldableTable table) {
        this.table = table;
    }


    public Room() {
    }

    public FoldableTable getTable() {
        return table;
    }

    public Chair[] getChairs() {
        return chairs;
    }

    @Override
    public String toString() {
        return "Room{" +
                "chairs=" + Arrays.toString(chairs) +
                ", table=" + table +
                '}';
    }
}
