package tasks.task17;

import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int planetNum;

		System.out.print("Enter planet number (from 0): ");

		planetNum = sc.nextInt();

		if (planetNum < 8) {
			System.out.print("Force of gravity: ");
			System.out.print(Planet.values()[planetNum].getP());
			System.out.print(" m/s²");
		}
		else {
			System.out.println("Error. No planet with this number.");
		}
	}
}
