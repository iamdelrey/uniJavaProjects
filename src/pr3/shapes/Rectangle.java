package pr3.shapes;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this(0, 0);
    }


    public Rectangle(double width, double length) {
        this(width, length, "transparent", false);
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    @Override
    public String toString() {
        return String.format("Rectangle w=%.03f l=%.03f", getWidth(), getLength());
    }
}