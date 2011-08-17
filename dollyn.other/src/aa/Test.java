package aa;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try {
			//以资源管理器方式打开指定的文件夹。
			//Runtime.getRuntime().exec("Explorer /e, c:\\gen");
			//Runtime.getRuntime().exec("set PATH=%APPDIR%;C:\\Program Files\\Microsoft Visual Studio\\VC98\\Bin;%PATH%");
			//Process pr = Runtime.getRuntime().exec("cmd /c \"c:\\aaa.bat\"");
			
			//Runtime.getRuntime().exec("cmd");
			//Runtime.getRuntime().exec("cmd   /c   /E:ON   start   a.bat");
			Runtime.getRuntime().exec("cmd.exe /c start c:\\aaa.bat");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
