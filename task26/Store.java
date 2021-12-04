package tasks.task26;

import java.util.Random;
import java.util.Scanner;

public class Store {
	int MAX_PRICE = 10000;

	public void startShopping()
	{
		Context context = new Context();
		Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
		Random random = new Random();
		String productName;

		int randomPrice = random.nextInt(MAX_PRICE);
		int paymentMethodNum;

		System.out.println("Hello! Welcome to our store");
		System.out.print("Enter name of product you want to buy: ");
		productName = scanner.next();

		System.out.print("Enter payment method (0 : Credit card, 1 : EWallet): ");
		paymentMethodNum = scanner.nextInt();

		context.setPaymentMethod(PaymentMethods.values()[paymentMethodNum]);
		context.pay(randomPrice);

		System.out.println("Thank you for your purchase. We will be glad to see you again in our store!");
	}
}
