package fourth;

public class HashHomework {
    public static void main(String[] args) {

        char hash = (char) 35;
        int printStar1 = 4;

        System.out.println("Q1:");
        printStar1(hash, printStar1);
        System.out.println();
        //printStar(hash, 20);

       //System.out.println("Q2:");
       //printStar1(hash, 1);
        //printStar1(hash, 2);
        //printStar1(hash, 3);
        //printStar1(hash, 4);
        //printStar1(hash, 5);

        System.out.println("Q2 attempt2:");
        printPyramid(hash, 5);
    }
    //homework
    // Q1 define function that takes int N argument and prints '#' N times, eg printHash(4) -> prints #### (hint System.out.print())

    static void printStar1(char character,int printNumber) {
        for (int index = 0; index < printNumber; index = index + 1) {  //could use index++ here too, same effect
            System.out.print(character);
        }
        System.out.println();
    }

    // Q2 using the above, write a function that draws a triangle of size N eg...
    //   #
    //   ##
    //   ###
    //   ####
    //   #####

    private static void printPyramid(char character, int pyramidSize) {
        for (int index = 1; index <= pyramidSize; index ++) {
            printStar2(character,index);
        }
    }

    private static void printStar2(char hash, int numberOfHashesToPrint) {
        int numberOfHashes = 0;

        do {
            System.out.print(hash);
            numberOfHashes ++;
        } while (numberOfHashesToPrint>numberOfHashes);


        System.out.println();
    }




}