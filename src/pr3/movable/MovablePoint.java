package pr3.movable;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        setY(getY() - getYSpeed());
    }

    @Override
    public void moveDown() {
        setY(getY() + getYSpeed());
    }

    @Override
    public void moveLeft() {
        setX(getX() - getXSpeed());
    }

    @Override
    public void moveRight() {
        setX(getX() + getXSpeed());
    }

    @Override
    public String toString() {
        return String.format("Point x=%d y=%d", getX(), getY());
    }
}