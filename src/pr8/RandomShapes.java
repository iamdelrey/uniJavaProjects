package pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int SHAPE_SIZE = 50;
    private static final int NUM_SHAPES = 20;

    private static abstract class Shape {
        protected Color color;
        protected int x;
        protected int y;

        public Shape(Color color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public abstract void draw(Graphics g);
    }

    private static class Square extends Shape {
        public Square(Color color, int x, int y) {
            super(color, x, y);
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, SHAPE_SIZE, SHAPE_SIZE);
        }
    }

    private static class Circle extends Shape {
        public Circle(Color color, int x, int y) {
            super(color, x, y);
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
        }
    }

    private RandomShapes() {
        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void drawRandomShapes(Graphics g) {
        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WINDOW_WIDTH - SHAPE_SIZE);
            int y = random.nextInt(WINDOW_HEIGHT - SHAPE_SIZE);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            Shape shape;
            if (random.nextBoolean()) {
                shape = new Square(color, x, y);
            } else {
                shape = new Circle(color, x, y);
            }

            shape.draw(g);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawRandomShapes(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomShapes main = new RandomShapes();
            main.setVisible(true);
        });
    }
}