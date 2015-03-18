package myExamples;

/**
 * Created by Robert.Chisholm on 01/03/2015.
 */
public class Lift {

    public static void main(String[] args) throws InterruptedException {
//   Basics of initialisation...
        String greeting;
        String goodbye;

        greeting = "Welcome what floor would you like?";
        goodbye = "Thanks for using this lift have a nice day";

        int liftsCurrentFloor = 0;  //Indicates which floor the lift is on
        int destinationFloor = liftsCurrentFloor;

        boolean groundFloor = (liftsCurrentFloor == 0 & destinationFloor == 0);

        if (groundFloor) {
            System.out.println(greeting);

        } else if (destinationFloor == 1) {
            System.out.println("You have arrived at level 1 - " + goodbye);
        } else {
            System.out.println("Please make a floor selection");
        }

        destinationFloor = liftsCurrentFloor + 1;
            System.out.println(" You have selected floor number - " + destinationFloor);
        Thread.sleep(1000);
            System.out.println("LIFT GOING UP >>>");
        Thread.sleep(3000);

        boolean d = (liftsCurrentFloor == 0 & destinationFloor == 0);

        if (d) {
            System.out.println(greeting);

        } else if (destinationFloor == 1) {
            System.out.println(" You have arrived at level 1 - " + goodbye);
            System.out.println(destinationFloor);
        } else {
            System.out.println("The lift is in motion");
        }

        destinationFloor = liftsCurrentFloor + 2;
        boolean e = (liftsCurrentFloor == 1 & destinationFloor == 1);
            System.out.println("You have selected floor - " + destinationFloor);
        Thread.sleep(1000);
            System.out.println("LIFT GOING UP >>>");
        Thread.sleep(3000);

        if (e) {
                System.out.println(greeting);

        } else if (destinationFloor == 2) {
                System.out.println("You have arrived at level 2 - " + goodbye);
                System.out.println(destinationFloor);
        } else {
                System.out.println("The lift is in motion");
            }

        destinationFloor = liftsCurrentFloor;
        boolean f = (liftsCurrentFloor == 1 & destinationFloor == 1);
        System.out.println("You have selected floor - " + destinationFloor);
        Thread.sleep(1000);
        System.out.println("<<< LIFT GOING DOWN");
        Thread.sleep(6000);

        if (f) {
            System.out.println(greeting);

        } else if (destinationFloor == 0) {
            System.out.println("You have arrived at Ground Level - " + goodbye);
            System.out.println(destinationFloor);
        } else {
            System.out.println("The lift is in motion");
        }

        System.out.println();
    }

}