package tasks.task22;

public class VictorianChair implements Chair {
	int x, y;

	int cleanlinessLevel;

	public VictorianChair()
	{
		this.cleanlinessLevel = 50;
	}

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

	public void dustOff()
	{
		cleanlinessLevel += 10;

		if (cleanlinessLevel > 100)
			cleanlinessLevel = 100;
	}
}
