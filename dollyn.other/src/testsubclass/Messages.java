package testsubclass;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.sun.org.apache.regexp.internal.RE;

public class Messages {
	private static final String BUNDLE_NAME = "testsubclass.messages"; //$NON-NLS-1$

//	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
			
	private static ResourceBundle RESOURCE_BUNDLE = null;
	
	
	private Messages() {
	}

	public static String getString(String key) {
		
		if (RESOURCE_BUNDLE == null) {
			URL url;
			try {
				url = new URL("file:C:\\test\\");
				URLClassLoader loader = new URLClassLoader(new URL[] {url});
				RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault(), loader);
				
				System.out.println(RESOURCE_BUNDLE);
				System.out.println(ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault(), loader));
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		}

		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
