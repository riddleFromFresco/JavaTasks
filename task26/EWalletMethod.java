package tasks.task26;

import java.util.Scanner;

public class EWalletMethod implements PaymentMethod {
	EWallet eWallet;

	@Override
	public void setPaymentData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EWallet login: ");
		String ewalletNumber = sc.next();
		System.out.print("Enter EWallet password: ");
		String ewalletPassword = sc.next();

		eWallet = new EWallet("login", "pword", 10000);
	}

	@Override
	public void pay(double money) throws NotEnoughFundsToPayException {
		if (eWallet.getBalance() >= money)
			eWallet.chargeOff(money);
		else
			throw new NotEnoughFundsToPayException("Unable to buy this product. You have not enough money.");
	}
}
