package tasks.task31;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import tasks.task30.IPv4ValidatorTest;

import java.io.*;

public class Task31 {
	public static String makeHeaderFromSubstr(String str, String substr, int level)
	{
		String header = "#".repeat(level) + " " + substr;
		str = str.replace(substr, header);

		return str;
	}

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// test result in variable
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);

		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(IPv4ValidatorTest.class);

		// default out
		System.out.flush();
		System.setOut(System.out);
		String testResult = baos.toString();

		testResult = "# Test result" + testResult;
		testResult = testResult.replace(".E", "");
		testResult = makeHeaderFromSubstr(testResult, "FAILURES!!!", 2);
		testResult = makeHeaderFromSubstr(testResult, "Time:", 2);
		testResult = testResult.trim();

		PrintWriter writer = new PrintWriter("test_result.md", "UTF-8");
		writer.println(testResult);
		writer.close();
	}
}