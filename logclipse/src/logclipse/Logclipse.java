package logclipse;
import logclipse.ui.LoggingConsole;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Logclipse extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "logclipse";
	
	// The shared instance
	private static Logclipse plugin;
	
	public Logclipse() {
		
	}
	
	public static Logclipse getDefault() {
		return plugin;
	}
	
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	public void stop(BundleContext context) throws Exception {
		plugin =  null;
		super.stop(context);
	}
	
	public static LoggingConsole getLoggingConsole() {
		return (LoggingConsole)findLoggingConsole();
	}
	
	private static MessageConsole findLoggingConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (LoggingConsole.NAME.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new LoggingConsole();
		conMan.addConsoles(new IConsole[] { myConsole });
//		myConsole.setFont( JFaceResources.getFontRegistry().get( PreferenceConstants.CONSOLE_FONT ) );
		return myConsole;
	}
}
