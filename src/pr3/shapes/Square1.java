package pr3.shapes;

public class Square1 extends Rectangle{
    public Square1() {
        this(0);
    }

    public Square1(double width) {
        this(width, "transparent", false);
    }

    public Square1(double width, String color, boolean filled) {
        super(width, width, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double width){
        setWidth(width);
        setLength(width);
    }
    @Override
    public void setLength(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString(){
        return String.format("Square s=%.03f", getSide());
    }
}