package tasks.task3;

public class Circle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}

class CircleTest{
    public static void main(String[] args) {
        int rad = 5;

        Circle crc = new Circle();
        crc.setRadius(rad);
        System.out.println(crc.getRadius());
    }
}