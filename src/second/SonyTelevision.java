package second;

public class SonyTelevision implements Television {
    @Override
    public void volumeUp() {
        System.out.println("Sony up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sony down");
    }
}
