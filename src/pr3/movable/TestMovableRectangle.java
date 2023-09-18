package pr3.movable;

public class TestMovableRectangle {
    public static void main(String[] args) {
        MovableRectangle rectangle1 = new MovableRectangle(1, 2, 5, 7, 10, 20);
        System.out.println("Rectangle 1:");
        System.out.println("Top-Left Corner (X): " + rectangle1.getTopLeftX());
        System.out.println("Top-Left Corner (Y): " + rectangle1.getTopLeftY());
        System.out.println("Bottom-Right Corner (X): " + rectangle1.getBottomRightX());
        System.out.println("Bottom-Right Corner (Y): " + rectangle1.getBottomRightY());
        System.out.println("X Speed: " + rectangle1.getTopLeftXSpeed());
        System.out.println("Y Speed: " + rectangle1.getTopLeftYSpeed());

        MovableRectangle rectangle2 = new MovableRectangle(10, 40, 20, 60, 10, 20);
        System.out.println("\nRectangle 2:");
        System.out.println("Top-Left Corner (X): " + rectangle2.getTopLeftX());
        System.out.println("Top-Left Corner (Y): " + rectangle2.getTopLeftY());
        System.out.println("Bottom-Right Corner (X): " + rectangle2.getBottomRightX());
        System.out.println("Bottom-Right Corner (Y): " + rectangle2.getBottomRightY());
        System.out.println("X Speed: " + rectangle2.getTopLeftXSpeed());
        System.out.println("Y Speed: " + rectangle2.getTopLeftYSpeed());


        System.out.println("\nMoving Rectangle 2:");
        rectangle2.moveUp();
        System.out.println("Top-Left Corner (X): " + rectangle2.getTopLeftX());
        System.out.println("Top-Left Corner (Y): " + rectangle2.getTopLeftY());
        System.out.println("Bottom-Right Corner (X): " + rectangle2.getBottomRightX());
        System.out.println("Bottom-Right Corner (Y): " + rectangle2.getBottomRightY());
        rectangle2.moveLeft();
        System.out.println("Top-Left Corner (X): " + rectangle2.getTopLeftX());
        System.out.println("Top-Left Corner (Y): " + rectangle2.getTopLeftY());
        System.out.println("Bottom-Right Corner (X): " + rectangle2.getBottomRightX());
        System.out.println("Bottom-Right Corner (Y): " + rectangle2.getBottomRightY());
        rectangle2.moveRight();
        System.out.println("Top-Left Corner (X): " + rectangle2.getTopLeftX());
        System.out.println("Top-Left Corner (Y): " + rectangle2.getTopLeftY());
        System.out.println("Bottom-Right Corner (X): " + rectangle2.getBottomRightX());
        System.out.println("Bottom-Right Corner (Y): " + rectangle2.getBottomRightY());
        rectangle2.moveDown();
        System.out.println("Top-Left Corner (X): " + rectangle2.getTopLeftX());
        System.out.println("Top-Left Corner (Y): " + rectangle2.getTopLeftY());
        System.out.println("Bottom-Right Corner (X): " + rectangle2.getBottomRightX());
        System.out.println("Bottom-Right Corner (Y): " + rectangle2.getBottomRightY());

        System.out.println("\nRectangle 3:");
        MovableRectangle rectangle3 = new MovableRectangle(40, 50, 70, 80, 10, 20);
        System.out.println(rectangle3.toString());
    }
}
