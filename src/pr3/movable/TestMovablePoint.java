package pr3.movable;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 2, 10, 20);
        System.out.println("Point 1:");
        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());
        System.out.println("X Speed: " + point1.getXSpeed());
        System.out.println("Y Speed: " + point1.getYSpeed());

        MovablePoint point2 = new MovablePoint(10, 40, 10, 20);
        System.out.println("\nPoint 2:");
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());
        System.out.println("X Speed: " + point2.getXSpeed());
        System.out.println("Y Speed: " + point2.getYSpeed());

        System.out.println("\nMoving Point 2:");
        point2.moveUp();
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());
        point2.moveLeft();
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());
        point2.moveRight();
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());
        point2.moveDown();
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());

        System.out.println("\nPoint 3:");
        MovablePoint point3 = new MovablePoint(40, 50, 10, 20);
        System.out.println(point3.toString());
    }
}
