package aa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestICS {

	public static void main(String[] args) {
		try {
			List<String> items = new ArrayList<String>();
			URL url = new URL("http://www.google.com/calendar/ical/tbbjusnfedvleqfc0n9vt8lo0o%40group.calendar.google.com/public/basic.ics");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = reader.readLine();
			while(line != null) {
				if(line.startsWith(""))
				line = reader.readLine();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
