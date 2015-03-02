package first;

public class Runner {

    public static void main(String[] args) {
        Car car1 = Car.newInstance(5, 4, "Blue");
        Car car2 = Car.newInstance(2, 2, "Red");

        Car redCar = Car.newRedCar(4, 3);
        System.out.println(redCar.getColour());

        System.out.println(car1.getColour());
        System.out.println(car2.getNumberOfDoors());

        Car car = Car.newTypicalCar();

        System.out.println(car);
    }
}
