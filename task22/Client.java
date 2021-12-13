package tasks.task22;

public abstract class Client implements Chair {
	boolean sitting = false;
	Chair chair;

	public void sit(Chair chair)
	{
		if (sitting)
			System.out.println("I can not sit to this chair. I am already sitting in another chair.");
		else {
			System.out.println("I sat down on a chair.");
			this.chair = chair;
			sitting = true;
		}
	}

	public void standUp()
	{
		if (!sitting)
			System.out.println("I can not stand up. I am already standing.");
		else {
			System.out.println("I got up from the chair.");
			this.sitting = false;
		}
	}

	public Chair getChair() {
		return chair;
	}
}
