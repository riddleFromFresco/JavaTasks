package tasks.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ImageCanvas extends Canvas {
    public void setImage(String path) throws IOException {
        BufferedImage bfdim = ImageIO.read(new File(path));
        ImageIcon ic = new ImageIcon(bfdim);
        JFrame jfr = new JFrame();
        jfr.setTitle("Image viewer");

        int width = bfdim.getWidth();
        int height = bfdim.getHeight();

        jfr.setLayout(new FlowLayout());
        jfr.setSize(width, height);
        JLabel label = new JLabel();
        label.setIcon(ic);

        jfr.add(label);
        jfr.setVisible(true);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException{
        ImageCanvas imgc = new ImageCanvas();
        imgc.setImage(args[0]);
    }
}
