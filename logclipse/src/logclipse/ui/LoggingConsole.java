package logclipse.ui;

import logclipse.Logclipse;

import org.eclipse.ui.console.MessageConsole;

public class LoggingConsole extends MessageConsole {

	public static final String NAME = "logclipse.logging";
//	private MessageConsoleStream messageStream;
	
	public LoggingConsole() {
		super(NAME, Logclipse.imageDescriptorFromPlugin(Logclipse.PLUGIN_ID, "icons/2.gif"));		
	}
	
	

}
