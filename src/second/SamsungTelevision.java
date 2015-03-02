package second;

public class SamsungTelevision implements Television {

    @Override
    public void volumeUp() {
        System.out.println("Samsung up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung down");
    }

    public void recordVoice(String message) {
        System.out.println("Recorded voices: " + message);
    }
}
