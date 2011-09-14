package logclipse;

import org.apache.log4j.WriterAppender;

public class LogclipseAppender extends WriterAppender {

	public LogclipseAppender() {
		setWriter(createWriter(Logclipse.getLoggingConsole().newMessageStream()));
	}
}
