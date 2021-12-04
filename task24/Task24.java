package tasks.task24;

public class Task24 {
	public static void main(String[] args) {
		IPv4Validator iPv4Validator = new IPv4Validator();

		boolean res;

		res = iPv4Validator.validate("255.255.100.110");
		System.out.println(res);
		res = iPv4Validator.validate("256.10.30.50");
		System.out.println(res);
		res = iPv4Validator.validate("20.0.279.50");
		System.out.println(res);
		res = iPv4Validator.validate("20.48.70.64");
		System.out.println(res);
	}
}