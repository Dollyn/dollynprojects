package logclipse;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;

public class PatternFormatter extends Formatter {

	private static String FORMAT = "{0,time} {1} {2}: {3}";
	
	private Date date = new Date();

    static {
    	LogManager manager = LogManager.getLogManager();
    	String className = PatternFormatter.class.getName();
    	String pattern = manager.getProperty(className + ".Pattern");
    	if (pattern == null) {
    		FORMAT = pattern;
    	}   	
    }
    
	@Override
	public synchronized String format(LogRecord record) {
		date.setTime(record.getMillis());
		String loggerName = record.getSourceClassName();
		if (loggerName == null) {
			loggerName = record.getLoggerName();
		}
		String level = record.getLevel().getLocalizedName();
		String message = formatMessage(record);		
		Object[] args = new Object[] {
				date,
				level,
				loggerName,
				message,
		};
		StringBuffer result = new StringBuffer();
		result.append(MessageFormat.format(FORMAT, args));
		
		if (record.getThrown() != null) {
			try {
				StringWriter sw = new StringWriter();
		        PrintWriter pw = new PrintWriter(sw);
		        record.getThrown().printStackTrace(pw);
		        pw.close();
		        result.append("\n");
		        result.append(sw.toString());
			} catch (Exception ex) {
			}
		}
		return result.toString();
	}

}
