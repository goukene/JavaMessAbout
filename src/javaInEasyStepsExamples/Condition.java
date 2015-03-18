package javaInEasyStepsExamples;

/**
 * Created by Robert.Chisholm on 15/03/2015.
 */
class Condition
{
    public static void main ( String[] args ) {
        int num1 = 1357 ;
        int num2 = 2468 ;
        String result ;

        result = ( num1 % 2 != 0) ? "Odd" : "Even" ; //modulus operator divides the first by the second and returns remainder
        System.out.println( num1 + " is " + result ) ;

        result = ( num2 % 2 != 0 ) ? "Odd" : "Even" ;
        System.out.println( num2 + " is " + result ) ;

        //result = ( num1 % 2 == 0) ? "Even" : "Odd" ; //modulus operator divides the first by the second and returns remainder
    }
}
