package aa;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestTimeZone {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINA);
		format.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
		System.out.println(format.format(date));
	}
	
}
