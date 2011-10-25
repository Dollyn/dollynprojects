package testswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestSwing1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class SimpleFrame extends JFrame {
	
	public SimpleFrame() {
		setSize(300, 200);
		add(new JButton("Button"));
	}
}
