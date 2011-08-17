package aa;

public class TestStringStartWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("aaabbb".startsWith("aaa"));
		System.out.println("aaabbb".startsWith("aaabbb"));
		System.out.println("\"aaabbb\".startsWith(\"\") ---> " + "aaabbb".startsWith(""));
	}

}
