import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import tester.Testing;
import tester.Validation;


public class TestTime implements Testing
{

	public static void main(String[] args)
	{
		Validation.run (new TestTime());
	}

	@Override
	public void doTests()
	{
		Time t = new Time (-4000);
		Validation.shouldHaveReportedError();
		t = new Time();
		GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT:00"));
		Validation.shouldBeEqual(t.getHour(), cal.get(Calendar.HOUR_OF_DAY));
		Validation.shouldBeEqual(t.getMinute(), cal.get(Calendar.MINUTE));
		Validation.shouldBeEqual(t.getSecond(), cal.get(Calendar.SECOND));
		t = new Time (555550000);
		cal.setTime(new Date (555550000));
		Validation.shouldBeEqual(t.getHour(), cal.get(Calendar.HOUR_OF_DAY));
		Validation.shouldBeEqual(t.getMinute(), cal.get(Calendar.MINUTE));
		Validation.shouldBeEqual(t.getSecond(), cal.get(Calendar.SECOND));
		t = new Time (0);
		cal.setTime(new Date (0));
		Validation.shouldBeEqual(t.getHour(), cal.get(Calendar.HOUR_OF_DAY));
		Validation.shouldBeEqual(t.getMinute(), cal.get(Calendar.MINUTE));
		Validation.shouldBeEqual(t.getSecond(), cal.get(Calendar.SECOND));
	}

}