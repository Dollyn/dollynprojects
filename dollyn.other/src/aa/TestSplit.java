package aa;

public class TestSplit {

	public static void main(String[] args) {
		System.out.println("/pub/a".split("\\/").length);
		System.out.println("aaa/bbb".split("/")[1]);
		System.out.println("aaa  bbb ".split(" ").length);
		System.out.println("aaa,bbb".split(",").length);
		System.out.println("aaa".split(",")[0]);
	}

}
