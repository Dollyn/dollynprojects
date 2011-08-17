package dollyn.algorithms.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Test {

	public static void main(String args[]) {
		//System.out.println(System.getProperty("user.dir"));
		//read("3_4.txt", 20);
		calculateReceipts("3_4.txt", 20);
	}
	
	public static void calculateReceipts(String fileName, int amount) {
		//读取数组。
		List<Invoice> invoices = read(fileName, amount);
		if(invoices == null || invoices.size() != amount) {
			System.out.println("文件错误");
			return;
		}
		
		Collections.sort(invoices);
		
		float max = invoices.get(amount - 1).value;
		float min = invoices.get(0).value;
		int max_Cmb_Num = 0;
		int min_Cmb_Num = 0;
		
		float temp = 0;
		for(int i = 0; i < amount; i ++) {
			temp += invoices.get(i).value;
			if(temp >= 1500) {
				max_Cmb_Num = i;
				break;
			}
		}
		if(temp == 0.0) max_Cmb_Num = amount;
		
		temp = 0;
		for(int i = amount - 1; i >=0; i--) {
			temp += invoices.get(i).value;
			if(temp >= 1500) {
				min_Cmb_Num = amount - i ;
				break;
			}
		}
		
		if(temp == 0) {
			System.out.println("总数不足以凑够1500");
			return;
		}
		
		Stack<Invoice> result = new Stack<Invoice>();
		float sum = 0;
		for(int i = min_Cmb_Num; i <= max_Cmb_Num; i++) {
			result.removeAllElements();

			int num = 0;
			for(int j = 0; j < amount; j++) {
				if(++num > i) break;
				sum += invoices.get(j).value;
				
				result.push(invoices.get(i));
				if(sum < 1500 && num < i) {
					continue;
				} else if(sum < 1500 && num >= i) {
					sum -= invoices.get(j).value;
					num--;
					result.pop();
				} else if(sum == 1500 && num == i ) {
					System.out.println(result);
				} 
			}
			
		}
		
	}

	/*
	 * 读取文件，返回一个数组;如果读取过程出错，则返回null.
	 */
	private static List<Invoice> read(String fileName, int amount) {
		File file = new File(fileName);
		FileReader fileReader = null;
		BufferedReader br = null;
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			String line = br.readLine();
			List<Invoice> invoices = new ArrayList<Invoice>();
			for(int i = 0; i < amount; i ++) {
				invoices.add(new Invoice(i, Float.parseFloat(line)));
				line = br.readLine();				
			}
			return invoices;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileReader != null) fileReader.close();
				if(br != null ) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		return null;
	}
	
	static class Invoice implements Comparable{
		int index;
		float value;
		
		public Invoice(int index, float value) {
			this.index = index;
			this.value = value;
		}

		public int compareTo(Object o) {
			Invoice other = (Invoice)o;
			if(other.value > value) {
				return -1;
			} else {
				return 1;
			}
		}
	}
	
}
