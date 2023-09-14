package pr3.shapes;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Is Filled: " + circle1.isFilled());
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        Circle circle2 = new Circle(6);
        System.out.println("\nCircle 2:");
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Is Filled: " + circle2.isFilled());
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        Circle circle3 = new Circle(13, "black", true);
        System.out.println("\nCircle 3:");
        System.out.println("Color: " + circle3.getColor());
        System.out.println("Is Filled: " + circle3.isFilled());
        System.out.println("Radius: " + circle3.getRadius());
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());

        // Пример проверки Circle как Shape
        Shape shape = circle3;
        System.out.println("\nShape (from Circle 3):");
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}