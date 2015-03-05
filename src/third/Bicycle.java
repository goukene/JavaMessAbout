package third;

/**
 * Created by robert.chisholm on 03/03/2015.
 */
public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 5;
    final int maxGear = 6;
    String name;

    void setName (String newName){
        name = newName;
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void incrementGear() {
        if (gear < maxGear) {
            gear ++;
            System.out.println(name + " - Changed gear:" + gear);
        }
        else {
            System.out.println(name + " - Maximum gear reached");
        }

    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println(name + " - cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}

