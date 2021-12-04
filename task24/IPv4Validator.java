package tasks.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4Validator {
	public boolean validate(String str)
	{
		String ipv4regex = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";

		return Pattern.matches(ipv4regex, str);
	}
}
