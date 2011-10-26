/**
 * 源程序名称：TestRuntime.java
 * 软件著作权：恒生电子股份有限公司 版权所有
 * 系统名称：JRES Studio
 * 模块名称：dollyn.other
 * 功能说明：$desc
 * 相关文档：
 * 作者：sundl
 */
package testruntime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * @author sundl
 */
public class TestRuntime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(toM(Runtime.getRuntime().totalMemory()));
		System.out.println(toM(runtime.freeMemory()));
		// System.out.println(runtime.);

		Method maxMemMethod;
		try {
			maxMemMethod = Runtime.class.getMethod("maxMemory", new Class[0]);
			Object o = maxMemMethod.invoke(Runtime.getRuntime(), new Object[0]);
			if (o instanceof Long) {
				long max = ((Long) o).longValue();
				System.out.println(toM(max));
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	private static long toM(long lon) {
		return lon / 1024 / 1024;
	}

}
