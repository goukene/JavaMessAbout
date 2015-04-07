package eight;

public class ArraysLookBack {

    public static void main(String[] args) {
//        int numbers [] = new int[10];

        int numbers [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};  // no explicit size given, compiler knows how many

        //for loop..
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);   //for loop using array index
        }

        //for each loop
        for (Integer num: numbers) {  //will iterate over 'numbers' array, storing each element in 'num' variable
            //must use 'Integer' here, not 'int'
            int dub = num * 2;

            System.out.println(dub);
        }



        //another foreach loop...
        String [] strs = {"one", "two", "three"};

        for (String s : strs) {
            System.out.println("String: " + s + ", length: " + s.length());
        }



    }

}
