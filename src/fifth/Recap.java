package fifth;

public class Recap {

//methods

    static String removeFirstLetter(String s) {
        String substring = s.substring(1);

        return substring;
    }


//objects/classes/interfaces
//revise this concept...


//arrays



//any questions?



// ArrayList , comparison to arrays


    //TODO find max/min in array


    public static void main(String[] args) {
        String hello = removeFirstLetter("hello");
        String hello2 = removeFirstLetter("shello");
        String hello3 = removeFirstLetter("rewrwehello");
        String hello4 = removeFirstLetter("fdsfsdhello");

        System.out.println(hello);
        System.out.println(hello2);
        System.out.println(hello3);
        System.out.println(hello4);
    }
}
