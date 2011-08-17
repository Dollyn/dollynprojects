package dollyn.other.pattern;

public class TestTagBreak {

	public static void main(String[] args) {
		int[] array = new int[] {0, 1, 2, 3, 4, 5};
		TAG:
		for(int i : array) {
			for(int j = 0; ; j++) {
				System.out.print(j + " ");
				if(j == 2) {
					System.out.println();
					break TAG;
				}
			}
//			System.out.println();
		}
	}

}
