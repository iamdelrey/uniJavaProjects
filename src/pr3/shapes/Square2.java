package pr3.shapes;

public class Square2 extends Rectangle {
    public Square2() {
        this(0);
    }

    public Square2(double width) {
        this(width, "transparent", false);
    }

    public Square2(double width, String color, boolean filled) {
        super(width, width, color, filled);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public String toString(){
        return String.format("Square s=%.03f", getLength());
    }
}