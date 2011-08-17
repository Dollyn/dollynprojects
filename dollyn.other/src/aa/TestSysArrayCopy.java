package aa;

public class TestSysArrayCopy {

	public static void main(String[] args) {
		int[] arr1 = new int[] {0};
		int[] arr2 = new int[0];
		System.arraycopy(arr1, 0, arr2, 0, 0);
	}
}
