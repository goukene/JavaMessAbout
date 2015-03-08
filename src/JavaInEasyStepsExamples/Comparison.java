package JavaInEasyStepsExamples;

/**
 * Created by Robert.Chisholm on 08/03/2015.
 */
class Comparison
{
    public static void main ( String[] args )
    {
        String txt = "Fantastic " ;
        String lang = "Java" ;
        boolean state = ( txt == lang );   // Assign test result
        System.out.println( "String Equality Test: " + state ) ;

        state = ( txt != lang ) ;   // Assign result
        System.out.println( "String Inequality Test: " + state ) ;

        int dozen = 12 ;
        int score = 20 ;
        state = ( dozen > score ) ; // Assign Result
        System.out.println( "Greater Than Test : " + state ) ;
        state = ( dozen < score ) ; // Assign Result
        System.out.println( "Less Than Test : " + state ) ;


    }
}