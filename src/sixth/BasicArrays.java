package sixth;

public class BasicArrays {

    public static void main(String[] args) {
        //one int:
        int x = 100;

        //array of ints

        int [] arr = new int[5];

        arr[0] = 4;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 43;
        arr[4] = 100;

        //   _______________________  what it looks like in memory
        //   | 4 | 3 | 2 | 43 | 100|
        //   -----------------------

        //print out 1st element
        System.out.print("First element: ");
        System.out.println(arr[0]);


        System.out.println("print all: ");
        //print all..
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //HW play around with arrays, create, modify, print out...
    }

}
