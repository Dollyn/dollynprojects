package aaa;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestLogClipse {

	public static void main(String[] args) {
		Log log = LogFactory.getLog(TestLogClipse.class);
		log.error("xx");
	}

}
