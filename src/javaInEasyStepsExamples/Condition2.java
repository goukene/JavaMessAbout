package JavaInEasyStepsExamples;

/**
 * Created by Robert.Chisholm on 15/03/2015.
 */
class Condition2
{
    private static final String ODD = "Odd";
    private static final String EVEN = "Even";


    public static void main ( String[] args ) {
        int num1 = 1357;
        int num2 = 2468;
        String[] result = {" - Odd", " - Even"};

        System.out.println(num1 + oddOrEven(num1));
        System.out.println(num2 + oddOrEven(num2));


//        if (num1 % 2 != 0) System.out.println(num1 + " = Odd");
//        else System.out.println(num1 + " = Even");
//
//        if (num2 % 2 != 0) System.out.println(num2 + " = Odd");
//        else System.out.println(num2 + " = Even");
    }

    static String oddOrEven (int numberValue)
    {
        if (numberValue % 2 == 0) {
            return EVEN;
        } else {
            return ODD;
        }
    }

}

