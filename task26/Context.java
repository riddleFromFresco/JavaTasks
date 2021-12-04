package tasks.task26;

enum PaymentMethods {
	CREDIT_CARD,
	EWALLET;
}

public class Context {
	PaymentMethod paymentMethod;

	public void setPaymentMethod(PaymentMethods paymentMethodName)
	{
		if (paymentMethodName == PaymentMethods.CREDIT_CARD) {
			paymentMethod = new CreditCardMethod();
			paymentMethod.setPaymentData();
		}
		else if (paymentMethodName == PaymentMethods.EWALLET) {
			paymentMethod = new EWalletMethod();
			paymentMethod.setPaymentData();
		}
	}

	public void pay(double money)
	{
		try {
			paymentMethod.pay(money);
		} catch (NotEnoughFundsToPayException exc) {
			exc.printStackTrace();
			System.exit(1);
		}
	}
}