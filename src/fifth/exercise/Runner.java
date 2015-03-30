package fifth.exercise;

public class Runner {
    public static void main(String[] args) {
        drawSomeShape(new TriangleDrawer());

        drawSomeShape(new SquareDrawer());

    }

    public static void drawSomeShape(DrawShape shapeDrawer) {
        shapeDrawer.drawShape();
    }


}
