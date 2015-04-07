package javaInEasyStepsExamples;

/**
 * Created by Robert.Chisholm on 22/03/2015.
 */
class Escape
{
    public static void main(String[] args )
    {
        String header = "\n\tNEW YORK 3-DAY FORECAST:\n" ;
        header += "\n\tDay\t\t\tHigh\tLow\tConditions\n" ;
        header += "\t---\t\t\t----\t---\t----------\n" ;

        String forecast = "\tSunday\t\t68F\t\t48F\tSunny\n" ;
        forecast += "\tMonday\t\t69F\t\t57F\tSunny\n" ;
        forecast += "\tTuesday\t\t71F\t\t50F\tCloudy\n" ;
        System.out.print( header + forecast) ;
    }
}
