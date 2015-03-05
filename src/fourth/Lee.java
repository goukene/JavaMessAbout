package fourth;

/**
 * Created by robert.chisholm on 05/03/2015.
 */
public class Lee {
public static void main(String[] args) {
    System.out.println("Question 1:");
    printHash(4);
    System.out.println("");
    System.out.println("Question 2:");
    drawTriangle(5);     }

    static void drawTriangle(int size){
        int lineNo = 1;
        for(int i=0;i<size;i++){
            for(int counter=0;counter<lineNo;counter++) {
                System.out.print("#");             }
            lineNo = lineNo+1;
            System.out.println("");         }
    }      static void printHash(int noOfTimesToLoop) {
        for(int i=0;i<noOfTimesToLoop;i++){
            System.out.print("#");         }      }
}


