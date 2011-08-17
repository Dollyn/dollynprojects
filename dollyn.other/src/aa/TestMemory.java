package aa;

import java.util.ArrayList;
import java.util.List;

public class TestMemory {

	public static void main(String args[]) {
		List<String> array = new ArrayList<String>();
		while (true) {
			array.add("Out of memory soon...");
			System.out.println("Out of memory soon...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
