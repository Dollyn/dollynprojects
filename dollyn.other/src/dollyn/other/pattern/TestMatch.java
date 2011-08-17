package dollyn.other.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatch {

	public static void main(String[] args) {

        String text = "abcdebcadxbc";

        Pattern pattern = Pattern.compile(".bc");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println();
        
		String str = "/** @author sundl */";
		Pattern pattern1 = Pattern.compile("@author\\s[a-zA-Z]*");
		Matcher matcher1 = pattern1.matcher(str);
		while (matcher1.find()) {
			System.out.println(matcher1.group());
		}

	}
	
}
