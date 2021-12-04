package tasks.task19;

public class Task19 {
	public static void main(String[] args) {
		try {
			RightTriangle tr = new RightTriangle(90, 89, 1);
		} catch(InvalidAngleException exc) {
			exc.printStackTrace();
		}
	}
}
