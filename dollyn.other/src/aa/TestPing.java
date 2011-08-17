package aa;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestPing {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "192.168.194.1";
		int timeOut = 3000; // 超时应该在3钞以上
		for (int i = 0; i < 5; i++) {
			long t0 = System.currentTimeMillis();
			boolean status = InetAddress.getByName(host).isReachable(timeOut);
			long t1 = System.currentTimeMillis();
			if(status)
				System.out.println(t1 - t0);
			else
				System.out.println("timeout");
		}
	}

}
