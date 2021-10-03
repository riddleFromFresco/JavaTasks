package tasks.task8;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.Random;
import java.util.Vector;

abstract class Shape {
    protected Vector<Integer> color = new Vector<Integer>();
    protected Vector<Integer> position = new Vector<Integer>();
}

class Circle extends Shape {
    public void setColor(int r, int g, int b) {
        this.color.clear();

        this.color.add(r);
        this.color.add(g);
        this.color.add(b);
    }

    public void setPosition(int x, int y) {
        this.position.clear();

        this.position.add(x);
        this.position.add(y);
    }

    public Vector<Integer> getColor() {
        return this.color;
    }
    public Vector<Integer> getPosition() {
        return this.position;
    }

    public void renderOnGraphics(Graphics2D gr2d) {
        int r = this.color.elementAt(0);
        int g = this.color.elementAt(1);
        int b = this.color.elementAt(2);
        gr2d.setColor(new Color(r, g, b));
        gr2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gr2d.fillOval(this.getPosition().elementAt(0), this.position.elementAt(1) , 100 , 100);
    }
}

class Rectangle extends Shape {
    public void setColor(int r, int g, int b) {
        this.color.clear();

        this.color.add(r);
        this.color.add(g);
        this.color.add(b);
    }

    public void setPosition(int x, int y) {
        this.position.clear();

        this.position.add(x);
        this.position.add(y);
    }

    public Vector<Integer> getColor() {
        return this.color;
    }
    public Vector<Integer> getPosition() {
        return this.position;
    }

    public void renderOnGraphics(Graphics2D gr2d) {
        int r = this.color.elementAt(0);
        int g = this.color.elementAt(1);
        int b = this.color.elementAt(2);
        gr2d.setColor(new Color(r, g, b));
        gr2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gr2d.fillRect(this.getPosition().elementAt(0), this.position.elementAt(1) , 100 , 100);
    }
}

class Triangle extends Shape {
    public void setColor(int r, int g, int b) {
        this.color.clear();

        this.color.add(r);
        this.color.add(g);
        this.color.add(b);
    }

    public void setPosition(int x, int y) {
        this.position.clear();

        this.position.add(x);
        this.position.add(y);
    }

    public Vector<Integer> getColor() {
        return this.color;
    }
    public Vector<Integer> getPosition() {
        return this.position;
    }

    public void renderOnGraphics(Graphics2D gr2d) {
        int r = this.color.elementAt(0);
        int g = this.color.elementAt(1);
        int b = this.color.elementAt(2);

        Path2D pth = new Path2D.Double();
        pth.moveTo(this.position.elementAt(0), this.position.elementAt(1));
        pth.lineTo((this.position.elementAt(0) + (100 / 2)), this.position.elementAt(1) - 100);
        pth.lineTo((this.position.elementAt(0) + 100), this.position.elementAt(1));
        pth.lineTo(this.position.elementAt(0), this.position.elementAt(1));
        pth.closePath();

        gr2d.setStroke(new BasicStroke(3));
        gr2d.setColor(new Color(r, g, b));
        gr2d.draw(pth);
        gr2d.fill(pth);
    }
}

class TestPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gr2d = (Graphics2D) g;

        Random random = new Random();

        int minShape = 0;
        int maxShape = 3;

        int minPosX = 10;
        int maxPosX = 550;
        int minPosY = 10;
        int maxPosY = 500;

        for (int i = 0; i < 20; i++){
            int shapeNum = random.nextInt(maxShape - minShape) + minShape;
            int posX = random.nextInt(maxPosX - minPosX) + minPosX;
            int posY = random.nextInt(maxPosY - minPosY) + minPosY;

            int re = random.nextInt(255);
            int gr = random.nextInt(255);
            int bl = random.nextInt(255);


            switch (shapeNum) {
                case 0:
                    Circle crcl = new Circle();
                    crcl.setColor(re, gr ,bl);
                    crcl.setPosition(posX, posY);
                    crcl.renderOnGraphics(gr2d);
                    break;
                case 1:
                    Rectangle rect = new Rectangle();
                    rect.setColor(re, gr ,bl);
                    rect.setPosition(posX, posY);
                    rect.renderOnGraphics(gr2d);
                    break;
                case 2:
                    Triangle trian = new Triangle();
                    trian.setColor(re, gr ,bl);
                    trian.setPosition(posX, posY);
                    trian.renderOnGraphics(gr2d);
                    break;
            }
        }
    }

    public TestPanel() {
        setLayout(null);

    }
}

class ShapesTest {
    public static void main(String[] args) {
        TestPanel tp1 = new TestPanel();
        tp1.setVisible(true);

        JFrame frame = new JFrame();
        frame.setTitle("Random shapes");
        frame.setSize(700, 700);
        frame.add(tp1);
        frame.setVisible(true);
    }
}
