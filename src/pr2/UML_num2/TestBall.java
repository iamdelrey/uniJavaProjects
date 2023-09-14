package pr2.UML_num2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(350, 50);
        System.out.println(ball);
        ball.move(12, 76);
        System.out.println(ball);
    }
}
