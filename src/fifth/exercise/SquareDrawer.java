package fifth.exercise;

public class SquareDrawer implements DrawShape {
    @Override
    public void drawShape() {
        for (int i = 0; i < 10; i++) {
            System.out.println("##########");
        }
    }
}
