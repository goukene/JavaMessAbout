package fourth;

public class DefiningMethods {

    public static void main(String[] args) {
        System.out.println( "start");

        int z = add1(100);

        System.out.println("z = " + z);

        System.out.println("after function");

        System.out.println(doubleMe(50));

        System.out.println(bad_halveIt(7));

        System.out.println(halveIt(7));


        //CASTING
        char another = (char)65;
        int intAnother = another;

        System.out.println(another);
        System.out.println(intAnother);

        int result = add(5, 4);
        System.out.println("add(5, 4) = " + result);
    }


    //Basics of function/method definition

// ignore, return type, name, parameter list
    static    int       add1(int p) {
        System.out.println("side effect");

        return p + 1;  //returns back to calling method - main in this case.
    }

    static int doubleMe(int x) {
        return x * 2;
    }

    // integer by integer division -> gives incorrect result, truncates decimal places
    static int bad_halveIt(int x) {
        return x / 2;
    }


    //Cast int to double for accurate result
    static double halveIt(int x) {
        return (double)x / 2;
    }

    //functions of more than 1 argument
    static int add(int a, int b) {
        return a + b;
    }

    //homework
    // Q1 define function that takes int N argument and prints '#' N times, eg printHash(4) -> prints #### (hint System.out.print())
    // Q2 using the above, write a function that draws a triangle of size N eg...
    //   #
    //   ##
    //   ###
    //   ####
    //   #####

}
