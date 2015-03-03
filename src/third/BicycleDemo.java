package third;

/**
 * Created by robert.chisholm on 03/03/2015.
 */
class BicycleDemo {
    public static void main(String[] args) {

        // Create two different
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        bike1.setName("bike1");
        Bicycle bike2 = new Bicycle();
        bike2.setName("bike2");

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.incrementGear();
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.incrementGear();
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.incrementGear();
        bike2.printStates();
    }
}

