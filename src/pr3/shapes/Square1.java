package pr3.shapes;

public class Square1 extends Rectangle{
    public Square1() {
        this(0);
    }

    public Square1(double side) {
        this(side, "transparent", false);
    }

    public Square1(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

//    public double getSide(){
//        return side;
//    }

//    public void setSide(double side){
//        this.side = side;
//    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

//    @Override
//    public String toString(){
//        return String.format("Square s=%.03f", getSide());
//    }
}