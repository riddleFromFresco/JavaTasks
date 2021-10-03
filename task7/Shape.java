package tasks.task7;

abstract public class Shape {
    String color;
    boolean filled;

    Shape() {}
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle extends Shape {

    private double radius;

    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, boolean filled) {
        this.radius = radius;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {}
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

class Square extends Rectangle {
    Square() {};
    Square(double side) {
        setWidth(side);
        setLength(side);
    }
    Square(double side, String color, boolean filled) {
        setWidth(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                '}';
    }
}

class TestShapes {
    public static void main(String[] args) {
        Square sq = new Square(5);
        System.out.println("Square: " + sq.getArea() + ", " + sq.getPerimeter());

        Circle crcl = new Circle(10);
        System.out.println("Circle: " + crcl.getArea());

        Rectangle rect = new Rectangle(15, 8);
        System.out.println("Rectangle: " + rect.getArea() + ", " + rect.getPerimeter());
    }
}