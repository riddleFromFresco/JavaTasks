package tasks.task22;

public class MultifunctionalChair implements Chair {
	int x,y;
	int armrestsAngle;
	int headrestHeight;

	@Override
	public void place(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void shift(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public void verticalMoveArmrests(int angle)
	{
		this.armrestsAngle += angle;
	}

	public void verticalMoveHeadrest(int height)
	{
		this.headrestHeight += height;
	}
}
