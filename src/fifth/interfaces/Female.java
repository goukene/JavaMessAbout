package fifth.interfaces;

public class Female implements Person {
    @Override
    public String getGender() {
        return "F";
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public String sayHello() {
        return "hello";
    }
}
