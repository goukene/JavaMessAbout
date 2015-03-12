package fifth.interfaces;

public class FrenchMan implements Person {
    @Override
    public String getGender() {
        return "M";
    }

    @Override
    public int getNumberOfLegs() {
        return 1;
    }

    @Override
    public String sayHello() {
        return "Bonjour";
    }
}
