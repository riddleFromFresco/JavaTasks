package tasks.task4;

public class BallFromUML {
    private Double x = 0.0;
    private Double y = 0.0;

    BallFromUML(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    BallFromUML() {}

    public Double getX() {
        return x;
    }
    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    public void move(Double xDisp, Double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ (" + getX() + ", " + getY() + ')';
    }
}

class Test_Ball {
    public static void main(String[] args) {
        BallFromUML ball = new BallFromUML();
        ball.setXY(4, 7);
        System.out.println(ball);
        ball.move(6.0, 9.0);
        System.out.println(ball);
    }
}