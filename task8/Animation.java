package tasks.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

class AnimationCanvas extends Canvas {
    JFrame mainFrame;
    JLabel animLabel;

    public void setImage(String pathToDir) throws IOException, InterruptedException {
        File pth = new File(pathToDir);
        String[] imgNames = pth.list();

        mainFrameSetting(pathToDir, imgNames[0]);

        BufferedImage currImg;

        while (this.isVisible()) {
            for (String imgname: imgNames) {
                currImg = ImageIO.read(new File(pathToDir + imgname));
                ImageIcon ic = new ImageIcon(currImg);

                animLabel.setIcon(ic);

                Thread.sleep(30);
            }
        }
    }

    private void mainFrameSetting(String pathToDir, String firstImgName) throws IOException{
        this.mainFrame = new JFrame();
        this.animLabel = new JLabel();

        this.mainFrame.setTitle("Animation viewer");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage firstImg = ImageIO.read(new File(pathToDir + firstImgName));
        int width = firstImg.getWidth();
        int height = firstImg.getHeight();

        mainFrame.setSize(width, height);
        mainFrame.add(animLabel);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        AnimationCanvas anCanv = new AnimationCanvas();
        anCanv.setImage(args[0]);
    }
}