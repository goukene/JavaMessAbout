package sixth;

public class Runner {

    public static void main(String[] args) {
        FoldableTable table = new FoldableTable(11, "Brown", false);
        Chair chair = new Chair(4, "Brown");

        Chair[] chairs = new Chair[2];  //Chair array of size 2
        chairs[0] = chair;    //add chairs to array
        chairs[1] = new Chair(3, "White");
//        chairs[2] = new Chair(2, "Red");   not allowed as array of size 2 only


        Room room = new Room(table, chairs);



        FoldableTable foldableTable = new FoldableTable(6, "Grey", false);

        System.out.println(foldableTable.getNumberOfLegs());  //we DO have access to Table's public methods here.

        System.out.println(room);
    }
}
