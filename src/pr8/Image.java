package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image extends JFrame {
    private static final int WINDOW_WIDTH = 570;
    private static final int WINDOW_HEIGHT = 800;

    private BufferedImage image;

    private Image(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setTitle("Image Viewer");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Image <image_path>");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            Image main = new Image(args[0]);
            main.setVisible(true);
        });
    }
}