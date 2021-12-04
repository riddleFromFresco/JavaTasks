package tasks.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBuilder extends DateTypeBuilder{
	public Date build(String dateStr)
	{
		Date date;

		long milliseconds = getMillisecondsFromDateStr(dateStr);
		date = new Date(milliseconds);

		return date;
	}


}