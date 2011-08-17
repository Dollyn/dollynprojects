package aa;

public class TestByte {
	public static void main(String[] args) {
		byte a = 126;
		byte b = 125;
		// byte c = a + b; // compile error, can't convert int to byte
		byte c = (byte) (a + b);
		System.out.println(c);
	}
}
