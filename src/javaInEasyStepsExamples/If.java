package javaInEasyStepsExamples;

/**
 * Created by Robert.Chisholm on 26/03/2015.
 */
class If
{
    public static void main (String[] args ){
        int num = 9 ;

        if ( 5 > 1 ) System.out.println("Five is greater than one");
        if ( 2 < 4 )
        {
            System.out.println( "Two is less than four." );
            System.out.println( "Test succeeded." );
        }

       if (((num > 5) && ( num < 10)) || (num == 12))
            System.out.println("Number is 6-9 inclusive, or 12");

    }
}
