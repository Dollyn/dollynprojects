package aaa;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import com.hundsun.sec.devtool.Control;
import com.hundsun.sec.devtool.DevtoolFactory;
import com.hundsun.sec.devtool.DevtoolPackage;
import com.hundsun.sec.devtool.Function;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Function function = DevtoolFactory.eINSTANCE.createFunction();
		System.out.println("Function Created...");
		
		Control control = DevtoolFactory.eINSTANCE.createControl();
		System.out.println("Control Created");
		
		new FunctionListener(function);
		System.out.println("Listner Created");
		
		function.setName("new Name");
		function.getComponets().add(control);
	}

}

class FunctionListener implements Adapter{
	
	private Notifier notifier;
	private Function function;
	
	public FunctionListener(Function fun) {
		this.function = fun;
		function.eAdapters().add(this);
	}
	
	@Override
	public Notifier getTarget() {
		return notifier;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type.equals(function.getClass());
	}

	@Override
	public void notifyChanged(Notification notification) {
	    int featureId = notification.getFeatureID(DevtoolPackage.class);
	    //notification.
	    switch (featureId) {
	    case DevtoolPackage.FUNCTION__NAME:
	    	System.out.println("Listener: function name changed to " + notification.getNewStringValue());
	    	break;
	    case DevtoolPackage.CONTROL:
	    	System.out.println("Listener: control added to function, the control is " + notification.getNewValue());
	    	break;
	    }
	}

	@Override
	public void setTarget(Notifier newTarget) {
		this.notifier = notifier;
	}
	
}