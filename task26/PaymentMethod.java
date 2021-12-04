package tasks.task26;

public interface PaymentMethod {
	public void setPaymentData();
	public void pay(double money) throws NotEnoughFundsToPayException;
}
