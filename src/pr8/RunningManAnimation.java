package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunningManAnimation extends JPanel implements ActionListener {
    private int manX = 100;
    private int manY = 50;
    private int frame = 1;
    private Timer timer;
    private ImageIcon[] manFrames;

    public RunningManAnimation() {
        manFrames = new ImageIcon[2];
        manFrames[0] = new ImageIcon("C:\\Users\\stepa\\IdeaProjects\\uniJavaProjects\\src\\pr8\\java8_1.png");
        manFrames[1] = new ImageIcon("C:\\Users\\stepa\\IdeaProjects\\uniJavaProjects\\src\\pr8\\java8_2.png");
        timer = new Timer(200, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        manFrames[frame].paintIcon(this, g, manX, manY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame = (frame + 1) % 2;
        manX += 5;
        if (manX > getWidth()) {
            manX = -manFrames[frame].getIconWidth();
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Running Man Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        RunningManAnimation animation = new RunningManAnimation();
        frame.add(animation);
        frame.setVisible(true);
    }
}