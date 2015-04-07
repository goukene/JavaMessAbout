package sixth;

public class Runner {



    public static void main(String[] args) {
        int SIZE = 2;

        FoldableTable table = new FoldableTable(11, "Brown", false);

        Chair brownChair = new Chair(4, "Brown");

        Chair[] chairsArray = new Chair[SIZE];  //Chair array of size 2,  (not creating Chairs here, just array which can hold references to chairs)

        //      0   1
        //    ---------
        //    |   |   |
        //    ---------
        //
        //

        chairsArray[0] = brownChair;    //add chairs to array

        chairsArray[1] = new Chair(3, "White");
//        chairs[2] = new Chair(2, "Red");   not allowed as array of size 2 only

        Chair chair = chairsArray[2];

        Room room = new Room(table, chairsArray);

        FoldableTable foldableTable = new FoldableTable(6, "Grey", false);

        System.out.println(foldableTable.getNumberOfLegs());  //we DO have access to Table's public methods here.

        System.out.println(room);


        String [] numbers = new String[4];
        numbers[0] = "one";
        numbers[1] = "two";
        numbers[2] = "three";
        numbers[3] = "four";
    }
}
