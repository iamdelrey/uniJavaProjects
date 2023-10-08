package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private BufferedImage[] frames;
    private int currentFrameIndex;
    private Timer animationTimer;

    private Animation(String[] imagePaths, int frameCount, int delay) {
        frames = new BufferedImage[frameCount];

        try {
            for (int i = 0; i < frameCount; i++) {
                BufferedImage fullImage = ImageIO.read(new File(imagePaths[i]));
                int frameWidth = (fullImage.getWidth() + frameCount - 1) / frameCount;
                int frameHeight = fullImage.getHeight();

                for (int j = 0; j < frameCount; j++) {
                    int x = j * frameWidth;
                    int y = 0;
                    int width = frameWidth;
                    int height = frameHeight;

                    // Проверка, чтобы избежать выхода за пределы изображения
                    if (x + width > fullImage.getWidth()) {
                        width = fullImage.getWidth() - x;
                    }

                    frames[j] = fullImage.getSubimage(x, y, width, height);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        currentFrameIndex = 0;
        animationTimer = new Timer(delay, e -> {
            currentFrameIndex = (currentFrameIndex + 1) % frames.length;
            repaint();
        });

        setTitle("Animation");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        BufferedImage currentFrame = frames[currentFrameIndex];
        int x = (getWidth() - currentFrame.getWidth()) / 2;
        int y = (getHeight() - currentFrame.getHeight()) / 2;
        g.drawImage(currentFrame, x, y, currentFrame.getWidth(), currentFrame.getHeight(), null);

    }

    public void startAnimation() {
        animationTimer.start();
    }

    public static void main(String[] args) {
        if (args.length != 7) {
            System.out.println("Usage: java Animation <image_path1> <image_path2> <image_path3> <image_path4> <image_path5> <frame_count> <delay>");
            System.exit(1);
        }

        String[] imagePaths = new String[5];
        System.arraycopy(args, 0, imagePaths, 0, 5);
        int frameCount = Integer.parseInt(args[5]);
        int delay = Integer.parseInt(args[6]);

        SwingUtilities.invokeLater(() -> {
            Animation animation = new Animation(imagePaths, frameCount, delay);
            animation.setVisible(true);
            animation.startAnimation();
        });
    }
}