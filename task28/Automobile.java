package tasks.task28;

public class Automobile {
	Engine engine;
	Chassis chassis;
	Coachbuilder coachbuilder;

	class Engine {
		public void start()
		{
			System.out.println("Driving.");
		}
		public void stop()
		{
			System.out.println("Stopped.");
		}
	}
	class Chassis {
		public void turnWheels(int side)
		{
			if (side == 0)
				System.out.println("Turned the wheels to the left.");
			else if (side == 2)
				System.out.println("Turned the wheels to the right.");
		}
	}
	class Coachbuilder {
		int capacity;

		public Coachbuilder(int capacity)
		{
			this.capacity = capacity;
		}

		public void openWindow()
		{
			System.out.println("Opened the window.");
		}
	}

	public Automobile(int capability)
	{
		this.engine = new Engine();
		this.chassis = new Chassis();
		this.coachbuilder = new Coachbuilder(capability);
	}

	public void openWindow()
	{
		Openable window = new Openable() {
			@Override
			public void open() {
				System.out.println("Window opened.");
			}
		};

		window.open();
	}

	public void go()
	{
		this.engine.start();
	}

	public void turnWheels(String side)
	{
		if (side == "left")
			this.chassis.turnWheels(0);
		else if (side == "right")
			this.chassis.turnWheels(2);
	}

	public void stop()
	{
		this.engine.stop();
	}
}
