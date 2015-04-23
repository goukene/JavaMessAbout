package ninth;

public class Bucket {

    private final int capacity;
    private int currentLevel = 0;

    public Bucket(int capacity) {
        this.capacity = capacity;
    }

    public void addWater(QuantityOfWater water) {
        if (capacity - currentLevel >= water.getAmount()) {
            System.out.println("Adding water: " + water.getAmount());
            currentLevel += water.getAmount();
        } else {
            System.out.println("Bucket full.");
        }
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "capacity=" + capacity +
                ", currentLevel=" + currentLevel +
                '}';
    }

    public static void main(String[] args) {
        Bucket bucket = new Bucket(50);

        bucket.addWater(new QuantityOfWater(30));
        bucket.addWater(new QuantityOfWater(20));
    }
}
