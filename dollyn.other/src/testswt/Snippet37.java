package testswt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Snippet37 {
	  // 文本框"Fail"：在 mouseMove中实现移位，跟随鼠标移动不正常
    private static Label failLbl = null;
    private static boolean selectedFail = false;
    
    // 文本框"Ok"：在 mouseUp中实现移位，跟随鼠标移动正常
    private static Label okLbl = null;
    private static boolean selectedOk = false;
    private static int xOk = 0;
    private static int yOk = 0;
    
    // 初始绝对坐标
    private static int initRx = 0;
    private static int initRy = 0;
    
    // 控件初始坐标
    private static int initX = 0;
    private static int inity = 0;
	
    public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(null);
	      // 创建文本框"Fail"
        if (failLbl == null) {
            failLbl = new Label(shell, SWT.BORDER);
            failLbl.setBounds(10, 10, 80, 30);
            failLbl.setText("Fail");
            failLbl.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseUp(MouseEvent e) {
                        if (selectedFail) {
                            selectedFail = false;
                            failLbl.setCursor(new Cursor(failLbl.getDisplay(), SWT.CURSOR_ARROW));
                        }
                    }
                    @Override
                    public void mouseDown(MouseEvent e) {
                        if (! selectedFail) {
                            selectedFail = true;
                            
                            Point location = failLbl.getLocation();
                            
                            initX = location.x;
                            inity = location.y;
                            
                            initRx = initX + e.x;
                            initRy = inity + e.y;
                            
                            failLbl.setCursor(new Cursor(failLbl.getDisplay(), SWT.CURSOR_CROSS));
                        }
                    }
                    @Override
                    public void mouseDoubleClick(MouseEvent e) { }
                }
            );
            failLbl.addMouseMoveListener(
                new MouseMoveListener() {
                    @Override
                    public void mouseMove(MouseEvent e) {
                        if (selectedFail) {
                            int rx2 = failLbl.getLocation().x + e.x;
                            int ry2 = failLbl.getLocation().y + e.y;
                            
                            int dx = rx2 - initRx;
                            int dy = ry2 - initRy;
                            
                            failLbl.setLocation(initX + dx, inity + dy);
                            System.out.println("event location2: (" + e.x + "," + e.y + ")");
                        }
                    }
                }
            );
        }
        // 创建文本框"Ok"
        if (okLbl == null) {
            okLbl = new Label(shell, SWT.BORDER);
            okLbl.setBounds(10, 50, 80, 30);
            okLbl.setText("Ok");
            okLbl.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseUp(MouseEvent e) {
                        if (selectedOk) {
                            selectedOk = false;
                            int x2 = okLbl.getLocation().x + e.x - xOk;
                            int y2 = okLbl.getLocation().y + e.y - yOk;
                            okLbl.setLocation(x2, y2);
                            okLbl.setCursor(new Cursor(okLbl.getDisplay(), SWT.CURSOR_ARROW));
                        }
                    }
                    @Override
                    public void mouseDown(MouseEvent e) {
                        if (! selectedOk) {
                            selectedOk = true;
                            xOk = e.x;
                            yOk = e.y;
                            okLbl.setCursor(new Cursor(okLbl.getDisplay(), SWT.CURSOR_CROSS));
                        }
                    }
                    @Override
                    public void mouseDoubleClick(MouseEvent e) { }
                }
            );
        }
		shell.setSize(200, 200);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
    
	
}