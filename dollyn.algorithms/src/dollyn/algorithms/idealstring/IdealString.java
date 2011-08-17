package dollyn.algorithms.idealstring;

public class IdealString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < 1; i++) {
			System.out.println(idealString(10000));
			//idealString(9000);
		}		
		long end = System.currentTimeMillis();
		System.out.println(end - t1);
	}

	public static String idealString(int len) {
		if(len <= 0) return "";
		int[] start = new int[0];//初始数组。
		//递归，获取索引数组。
		int[] result = next(start, len);
		//根据索引数组构造字符串，并返回。
		return makeString(result);
	}
	
	/**
	 * 递归寻找组合。
	 * 数组里存放每个字符第一次出现的位置。例如（1， 2，4）代表3个字母，分别首次出现在第一、第二、第四个位置上。
	 * 而数组里数字的总和就是字符串的长度（第一次出现的位置等于字符串出现的总次数）。
	 * @param all 当前组合。
	 * @param len 需要达到的总和。
	 * @return 当前递归的组合
	 */
	private static int[] next(int[] all, int len) {
		int current_sum = sum(all);
		int min = 0;
		if(all.length != 0) min = all[all.length - 1];
		
		//下一个数字最大为当前组合的总和+1.
		for(int i = current_sum + 1; i > min; i--) {
			if(current_sum + i == len) {
				//成功，返回。
				int[] result = push(i, all);
				return result;
			} else if(current_sum + i < len) {
				//小于要达到的组合，继续递归。
				int[] result = next(push(i, all), len);
				if(result == null) {
					continue;
				} else {
					return result;
				}
			}
			//这里隐含着大于的话就继续循环。
		}		
		return null;
	}
	
	/**
	 * 根据索引数组构造字符串。数组里存放的索引是基于1的。 
	 * @param indexes 索引数组。
	 * @return 由索引构造的字符串。
	 */
	private static String makeString(int[] indexes) {
		if(indexes == null) return "";
		
		char[] result = new char[sum(indexes)];
		
		//初始化
		for(int i = 0; i < result.length; i++) {
			result[i] = '?';
		}
		
		//根据数组，先把每个字符放到它第一次出现的位置上。其他位置留空（初始化为？）
		for(int i = 0; i < indexes.length; i++) {
			result[indexes[i] - 1] =  (char)('0' + i + 17);
			indexes[i]--;
		}
		
		//填空。选取当前未使用的字母中最小的依次填充。
		for(int i = 0; i < result.length; i++) {
			if(result[i] != '?') continue;
			for(int j = 0; j < indexes.length; j++) {				
				if(indexes[j] != 0) {
					result[i] = (char)('0' + j + 17);
					indexes[j]--;
					break;
				}
			}
		}
		return String.valueOf(result);
	}
	
	/**
	 * 把给定的数附加到给定的数组最后，并返回新数组。
	 */
	private static int[] push(int i, int[] current) {
		int[] result = new int[current.length + 1];
		System.arraycopy(current, 0, result, 0, current.length);
		result[current.length] = i;
		return result;
	}
	
	/**
	 * 计算数组元素的总和并返回.
	 */
	private static int sum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		return sum;		
	}
}
