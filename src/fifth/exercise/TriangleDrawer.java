package fifth.exercise;

public class TriangleDrawer implements DrawShape {

    @Override
    public void drawShape() {
        printPyramid('#', 10);
    }

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
