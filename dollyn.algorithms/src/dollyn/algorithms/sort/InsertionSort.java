package dollyn.algorithms.sort;

/**
 * The implementation of Insertion sort.
 * @author dollyn
 */
public class InsertionSort {

	/**
	 * The main.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] keys = {3, 2, 1};
		
		sort_NonDecresing(keys);
		for(int i = 0; i < keys.length; i ++) {
			System.out.println(keys[i]);
		}
		
		sort_NonIncresing(keys);
		for(int i = 0; i < keys.length; i ++) {
			System.out.println(keys[i]);
		}
	}

	/**
	 * Sort the given array of keys.
	 * @param keys the keys to be sorted.
	 */
	private static void sort_NonDecresing(int[] keys) {
		//select one element as the current key,
		//and the elements before the current key were sorted already.
		for(int i = 1; i < keys.length; i++) {
			int key = keys[i];
			
			//compare the current key and the before elements,
			//and try to insert into the sorted sequence.
			int j = i - 1;
			while(j >= 0 && keys[j] > key) {
				//if the element before is larger than the current key,
				//then, put it back, and go on compare the before ones.
				keys[j + 1] = keys[j];
				j--;
			}
			//the place to insert.
			keys[j + 1] = key;
		}
	}
	
	private static void sort_NonIncresing(int[] keys) {
		for(int i = 1; i < keys.length; i++) {
			int key = keys[i];
			
			int j = i - 1;
			while( j >= 0 && keys[j] < key) {
				keys[j + 1] = keys[j];
				j--;
			}
			
			keys[j + 1] = key;
		}
	}

}
