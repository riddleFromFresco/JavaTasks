package tasks.task22;

public class MagicChair implements Chair {
	int x, y;

	boolean visible;

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

	void setVisibility(boolean visibility)
	{
		this.visible = visibility;
	}
}
