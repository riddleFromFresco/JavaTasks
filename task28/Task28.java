package tasks.task28;

public class Task28 {
	public static void main(String[] args) {
		Automobile automobile = new Automobile(5);
		automobile.go();
		automobile.openWindow();
		automobile.turnWheels("right");
		automobile.stop();
	}
}
