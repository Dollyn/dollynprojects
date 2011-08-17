package aaa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Test {

	public static void main(String[] args) {
		File dir = new File("D:\\dmbj");
		File to = new File("D:\\dmbj.html");
		String ignor1 = "笨鸟范文网制作 更多精彩图书尽在笨鸟范文网";
		String ignor2 = "电脑访问：http://www.cqcyq.net     http://www.cqcyq.com";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(to);
			bw = new BufferedWriter(fw);
			
			for(File file : dir.listFiles()) {
				FileReader fr = null;
				
				try {
					fr = new FileReader(file);
					
					BufferedReader br = new BufferedReader(fr);
					String line = br.readLine();
					while(line != null) {
						if( ! (line.equals(ignor1) || line.equals(ignor2))) {
							bw.write("<p>" + line + "\r\n" + "<P>");
						}
						
						line = br.readLine();
					}
													
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(fr != null)
							fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}			
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
