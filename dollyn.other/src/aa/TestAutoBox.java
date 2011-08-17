package aa;

import java.util.HashMap;
import java.util.Map;

public class TestAutoBox {

	public static void main(String[] args) {
		Map<String, Boolean> testMap = new HashMap<String, Boolean>();
		testMap.put("aa", true);
		System.out.println(testMap.get("aa"));
		boolean b = testMap.get("bb");
		System.out.println(b);
	}

}
