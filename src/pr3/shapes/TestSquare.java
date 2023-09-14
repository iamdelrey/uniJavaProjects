package pr3.shapes;

public class TestSquare {
    public static void main(String[] args) {
        Square2 square1 = new Square2();
        System.out.println("Square 1:");
        System.out.println("Color: " + square1.getColor());
        System.out.println("Is Filled: " + square1.isFilled());
        System.out.println("Width: " + square1.getWidth());
        System.out.println("Height: " + square1.getLength());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        Square2 square2 = new Square2(3);
        System.out.println("\nSquare 2:");
        System.out.println("Color: " + square2.getColor());
        System.out.println("Is Filled: " + square2.isFilled());
        System.out.println("Width: " + square2.getWidth());
        System.out.println("Height: " + square2.getLength());
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());

        Square2 square3 = new Square2(5, "white", true);
        System.out.println("\nSquare 3:");
        System.out.println("Color: " + square3.getColor());
        System.out.println("Is Filled: " + square3.isFilled());
        System.out.println("Width: " + square3.getWidth());
        System.out.println("Height: " + square3.getLength());
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());

        // Пример проверки Square как Shape
        Shape shape = square3;
        System.out.println("\nShape (from Square 3):");
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());

        // Пример проверки Square как Rectangle
        Rectangle rect = square3;
        System.out.println("\nRectangle (from Square 3):");
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}