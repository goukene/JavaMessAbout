package third;

import java.util.Scanner;

public class Elevator {
    private int currentFloor;

    public Elevator() {

        currentFloor = 0;
    }
    public static void main (String[]args){
        Elevator myElevator=new Elevator();
        myElevator.selectFloor();
    }
    public void selectFloor() {

        Scanner scnr = new Scanner(System.in);
        int newFloor;

        System.out.println("Enter the floor you'd like to go to ==> ");
        newFloor = scnr.nextInt();
        if (newFloor > 100 || newFloor < 0 || newFloor == 13) {
            System.out.println("Invalid selection");
        }

        else {  // The if was not necessary
            int direction = 0;
            if(currentFloor < newFloor){
                direction = 1; // going up;
                System.out.print("going up");
            } else if (currentFloor > newFloor) {
                direction = -1; //going down;
                System.out.print("going up");
            } else {
                direction = 0; //going nowhere;
                System.out.print("Please choose another floor to the one you are on");
            }
            for (; currentFloor != newFloor; currentFloor += newFloor)
                System.out.println("...");
            System.out.println("Ding!");
        }
    }

    public void fireAlarm() {
        System.out.println("Danger, you must exit the building now!");
    }

}