package tasks.task18;

import java.util.Collections;
import java.util.Scanner;

/*Условимся, что ИНН пользователя действителен, если он равен первым 12 цифрам хэш-кода строки с его ФИО.
* Если хэш-код состоит менее, чем из 12 символов, ИНН дополняется нулями справа.
* */

public class OnlineStore {
	String productName;

	public void start() {
		System.out.println("Hello! Welcome to our store");
		chooseProduct();
		try {
			makeOrder();
		} catch (IllegalArgumentException exc) {
			exc.printStackTrace();
			System.exit(-1);
		}
	}

	public void chooseProduct()
	{
		Scanner sc = new Scanner(System.in).useDelimiter("\\n");
		System.out.print("Enter name of product you want to buy: ");

		this.productName = sc.next();
	}

	public void makeOrder() throws IllegalArgumentException {
		Scanner sc = new Scanner(System.in).useDelimiter("\\n");

		String inn;
		String fullName;

		System.out.print("Enter your full name: ");
		fullName = sc.nextLine();
		System.out.print("Enter your INN: ");
		inn = sc.next();

		if (inn.length() != 12) {
			System.out.println("Error. Wrong INN.");
			return;
		}

		String userInn = getInnForUser(fullName);
		if (!inn.equals(userInn))
			throw new IllegalArgumentException("Invalid INN.");

		System.out.println("Your order has been sent. Thank you for your purchase!");
	}

	String getInnForUser(String fullName)
	{
		String fullNameHash = "";

		fullNameHash = String.valueOf(Math.abs(fullName.hashCode()));

		if (fullNameHash.length() < 12)
			fullNameHash += String.join("", Collections.nCopies(12-fullNameHash.length(), "0"));
		else if (fullNameHash.length() > 12)
			fullNameHash = fullNameHash.substring(0, 12);

		return fullNameHash;
	}
}
