package tasks.task25;

public class Task25 {
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		RedShapeDecorator rsDecorator = new RedShapeDecorator(rect);
		rsDecorator.setRedBorder();
		rsDecorator.draw();
	}
}
