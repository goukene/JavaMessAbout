package sixth;

import java.util.Random;

/**
 * Created by robert.chisholm on 07/04/2015.
 */
public class ArraysHomework {

    public static void main(String[] args) {

        int [] dicenumber1 = new int[6];

        dicenumber1[0] = 1;
        dicenumber1[1] = 2;
        dicenumber1[2] = 3;
        dicenumber1[3] = 4;
        dicenumber1[4] = 5;
        dicenumber1[5] = 6;

        int [] dicenumber2 = new int[6];

        dicenumber2[0] = 1;
        dicenumber2[1] = 2;
        dicenumber2[2] = 3;
        dicenumber2[3] = 4;
        dicenumber2[4] = 5;
        dicenumber2[5] = 6;

        //print out 1st element
//        System.out.print("First element: ");
//        System.out.println(dicenumber1[0]);

        int randomdice1 = (dicenumber1[new Random().nextInt(dicenumber1.length)]);
        System.out.println("Dice 1 = " + randomdice1);

        int randomdice2 = (dicenumber2[new Random().nextInt(dicenumber2.length)]);
        System.out.println("Dice 2 = " + randomdice2);

        int dicetotal = randomdice1 + randomdice2;
        System.out.println("Total = " + dicetotal);

        if ((randomdice1==6) && (randomdice2==6)){
        System.out.println("SNAKE EYES!!!!");
        }
        else if ((randomdice1) == (randomdice2)){
        System.out.println("DOUBLE");
        }

}
        //HW play around with arrays, create, modify, print out...
}

