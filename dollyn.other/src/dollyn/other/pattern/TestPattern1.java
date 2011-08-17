package dollyn.other.pattern;

public class TestPattern1 {

	public static void main(String args[]) {
		String str = "_abcd1";
		System.out.println(str.matches("[a-zA-Z_]+\\w*"));
	}
}
