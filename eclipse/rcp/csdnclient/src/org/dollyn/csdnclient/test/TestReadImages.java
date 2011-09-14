package org.dollyn.csdnclient.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class TestReadImages {

	public static void main(String[] args) throws URISyntaxException, IOException {
		String prefix = "http://forum.csdn.net/PointForum/ui/scripts/csdn/Plugin/001/face/";
		File dir = new File("c:\\images\\");
		dir.mkdirs();
		for(int i = 0; i < 105; i++) {
			try {				
				URL url = new URL(prefix + i + ".gif");
				InputStream is = url.openStream();
				byte[] bytes = new byte[1000000];
				int length = 0;
				int ch = is.read();
				while(ch != -1) {
					bytes[length] = (byte)ch;
					length++;
					ch = is.read();
				}
				byte[] content = new byte[length];
				System.arraycopy(bytes, 0, content, 00, length);
				FileOutputStream fos = new FileOutputStream("c:\\images\\" + i + ".gif");
				fos.write(content);
				System.out.println(i);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}
