package tasks.task26;

import java.util.Scanner;

public class CreditCardMethod implements PaymentMethod {
	CreditCard creditCard;

	@Override
	public void setPaymentData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter credit card number: ");
		String cardNumber = sc.next();
		System.out.print("Enter cvv: ");
		int cvv = sc.nextInt();

		creditCard = new CreditCard(cardNumber, cvv, 10000);
	}

	@Override
	public void pay(double money) throws NotEnoughFundsToPayException {
		if (creditCard.getBalance() >= money)
			creditCard.chargeOff(money);
		else
			throw new NotEnoughFundsToPayException("Unable to buy this product. You have not enough money.");
	}
}