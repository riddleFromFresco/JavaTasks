package tasks.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarBuilder extends DateTypeBuilder{
	Calendar build(String dateStr)
	{
		Calendar calendar = Calendar.getInstance();

		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			calendar.setTime(sdf.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return calendar;
	}
}
