package tasks.task26;

public class EWallet {
	String login;
	String password;
	double balance;

	public EWallet(String login, String password, double balance)
	{
		this.login = login;
		this.password = password;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void chargeOff(double money) {
		this.balance -= money;
	}
}
