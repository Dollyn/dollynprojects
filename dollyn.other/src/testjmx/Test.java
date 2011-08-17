package testjmx;

import java.util.HashMap;
import java.util.Set;

import javax.management.MBeanInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class Test {

	public static void main(String[] args) throws Exception {
		HashMap<String, Object> env = new HashMap<String, Object>(); 
		String[] credentials = new String[] { "smx" , "smx" }; 
        env.put("jmx.remote.credentials", credentials); 
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/karaf-root");
		JMXConnector jmxc = JMXConnectorFactory.connect(url, env);
		MBeanServerConnection connection = jmxc.getMBeanServerConnection();
		String[] domains = connection.getDomains();
		for (String domain : domains) {
			System.out.println(domain);
		}
		
//		String objName = "org.apache.servicemix:ContainerName=ServiceMix,Type=SystemService,Name=AdminCommandsService";
//		Set names = connection.queryNames(new ObjectName(objName), null);
//		for (Object name : names) {
//			ObjectName oName = (ObjectName) name;
//			System.out.println("Name: " + oName.getCanonicalName());
//		}
		
		String objName = "osgi.core:type=framework";
		Set names = connection.queryNames(new ObjectName(objName), null);
		for (Object name : names) {
			ObjectName oName = (ObjectName) name;
//			System.out.println("Name: " + oName.getCanonicalName());
//			connection.getAttribute(oName, "Bundles");
			Object result = connection.invoke(oName, "shutdownFramework", new Object[] {}, new String[] {});
			System.out.println(result);
//			MBeanInfo info = connection.getMBeanInfo(oName);
//			for (MBeanOperationInfo opInfo : info.getOperations()) {
//				System.out.println("opInfo.getName():" + opInfo.getName());
//				for (MBeanParameterInfo mpInfo : opInfo.getSignature()) {
//					System.out.println(mpInfo.getType());
//				}
//			}
		}
	}

}
