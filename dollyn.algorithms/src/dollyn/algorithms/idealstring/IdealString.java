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
		int[] start = new int[0];//��ʼ���顣
		//�ݹ飬��ȡ�������顣
		int[] result = next(start, len);
		//�����������鹹���ַ����������ء�
		return makeString(result);
	}
	
	/**
	 * �ݹ�Ѱ����ϡ�
	 * ��������ÿ���ַ���һ�γ��ֵ�λ�á����磨1�� 2��4������3����ĸ���ֱ��״γ����ڵ�һ���ڶ������ĸ�λ���ϡ�
	 * �����������ֵ��ܺ;����ַ����ĳ��ȣ���һ�γ��ֵ�λ�õ����ַ������ֵ��ܴ�������
	 * @param all ��ǰ��ϡ�
	 * @param len ��Ҫ�ﵽ���ܺ͡�
	 * @return ��ǰ�ݹ�����
	 */
	private static int[] next(int[] all, int len) {
		int current_sum = sum(all);
		int min = 0;
		if(all.length != 0) min = all[all.length - 1];
		
		//��һ���������Ϊ��ǰ��ϵ��ܺ�+1.
		for(int i = current_sum + 1; i > min; i--) {
			if(current_sum + i == len) {
				//�ɹ������ء�
				int[] result = push(i, all);
				return result;
			} else if(current_sum + i < len) {
				//С��Ҫ�ﵽ����ϣ������ݹ顣
				int[] result = next(push(i, all), len);
				if(result == null) {
					continue;
				} else {
					return result;
				}
			}
			//���������Ŵ��ڵĻ��ͼ���ѭ����
		}		
		return null;
	}
	
	/**
	 * �����������鹹���ַ������������ŵ������ǻ���1�ġ� 
	 * @param indexes �������顣
	 * @return ������������ַ�����
	 */
	private static String makeString(int[] indexes) {
		if(indexes == null) return "";
		
		char[] result = new char[sum(indexes)];
		
		//��ʼ��
		for(int i = 0; i < result.length; i++) {
			result[i] = '?';
		}
		
		//�������飬�Ȱ�ÿ���ַ��ŵ�����һ�γ��ֵ�λ���ϡ�����λ�����գ���ʼ��Ϊ����
		for(int i = 0; i < indexes.length; i++) {
			result[indexes[i] - 1] =  (char)('0' + i + 17);
			indexes[i]--;
		}
		
		//��ա�ѡȡ��ǰδʹ�õ���ĸ����С��������䡣
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
	 * �Ѹ����������ӵ�������������󣬲����������顣
	 */
	private static int[] push(int i, int[] current) {
		int[] result = new int[current.length + 1];
		System.arraycopy(current, 0, result, 0, current.length);
		result[current.length] = i;
		return result;
	}
	
	/**
	 * ��������Ԫ�ص��ܺͲ�����.
	 */
	private static int sum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		return sum;		
	}
}
