package tasks.task19;

public class RightTriangle {
	int angle1;
	int angle2;
	int angle3;

	public RightTriangle(int angle1, int angle2, int angle3) throws InvalidAngleException {
		if (((angle1 + angle2 + angle3) != 180) || (angle1 != 90 && angle2 != 90 && angle3 != 90) ||
				(angle1 < 1 || angle2 < 1 || angle3 < 1))
			throw new InvalidAngleException("Wrong angle values.");
		else
			System.out.println("Right triangle has been successfully created.");
	}
}
