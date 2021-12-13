package tasks.task30;

import org.junit.Assert;
import org.junit.Test;
import tasks.task24.IPv4Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IPv4ValidatorTest {
	@Test
	public void validate() {
		ArrayList<String> testData = new ArrayList<>(Arrays.asList("255.255.100.110", "256.10.30.50",
				"20.0.279.50", "20.48.70.64", "10.10.200"));

		ArrayList<Boolean> expected = new ArrayList<>(Arrays.asList(true, false, false, true, false));
		ArrayList<Boolean> actual = new ArrayList<>();

		IPv4Validator validator = new IPv4Validator();
		boolean temp;
		for (String value : testData) {
			temp = validator.validate(value);
			actual.add(temp);
		}

		Assert.assertEquals(expected, actual);
	}
}
