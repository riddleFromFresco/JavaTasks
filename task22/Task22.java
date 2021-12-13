package tasks.task22;

public abstract class Task22 implements ChairFactory {
	public static void main(String[] args) {
		VictorianChairFactory victorianChairFactory = new VictorianChairFactory();
		MagicChairFactory magicChairFactory = new MagicChairFactory();
		MultifunctionalChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();

		Client client = new Client();
		Chair victorianChair = victorianChairFactory.createChair();
		Chair magicChair = magicChairFactory.createChair();
		Chair multifunctionalChair = multifunctionalChairFactory.createChair();

		client.sit(victorianChair);
		client.sit(magicChair);
		client.standUp();
		client.sit(magicChair);
		client.standUp();
		client.sit(multifunctionalChair);
		client.standUp();
		client.standUp();
	}
}
