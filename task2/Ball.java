package tasks.task2;

public class Ball {
   private String color;
   private Double diameter;
   private Double cost;

   public Ball() {};

   public Ball(String color, Double diameter, Double cost) {
        setColor(color);
        setCost(cost);
        setDiameter(diameter);
   }

   public void setColor(String color) {
       this.color = color;
   }
   public void setCost(Double cost) {
       this.cost = cost;
   }
   public void setDiameter(Double diameter) {
       this.diameter = diameter;
   }

   public Double getCost() {
       return cost;
   }
   public Double getDiameter() {
       return diameter;
   }
   public String getColor() {
       return color;
   }

   public String toString() {
       return this.color + ", " + Double.toString(diameter) + ", " + Double.toString(cost);
   }
}

class testBall {
    public static void main(String[] args) {
        Ball firstBall = new Ball();
        Ball secondBall = new Ball("red", 10.0, 20.0);

        firstBall.setColor("blue");
        firstBall.setCost(200.0);
        firstBall.setDiameter(30.0);

        System.out.println(firstBall);
        System.out.println(secondBall);
    }
}
