package fifth.interfaces;

public class Male implements Person {
    @Override
    public String getGender() {
        return "M";
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public String sayHello() {
        return "Howdy";
    }
}
