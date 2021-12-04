package tasks.task26;

class CreditCard
{
	String number;
	int cvv;
	double balance;

	public CreditCard(String number, int cvv, double balance)
	{
		this.number = number;
		this.cvv = cvv;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	public void chargeOff(double money) {
		this.balance -= money;
	}
}
