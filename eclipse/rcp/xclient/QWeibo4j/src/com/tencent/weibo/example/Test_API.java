package com.tencent.weibo.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

import com.tencent.weibo.api.Fav_API;
import com.tencent.weibo.api.Private_API;
import com.tencent.weibo.beans.OAuth;
import com.tencent.weibo.utils.OAuthClient;
import com.tencent.weibo.utils.WeiBoConst;

public class Test_API {

	private static String verify = null;

	public static void main(String[] args) {
		try {
			test_list_t();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void test_list_t() throws Exception {
		OAuth oauth = new OAuth();
		OAuthClient auth = new OAuthClient();

		// 获取request token
		oauth = auth.requestToken(oauth);

		if (oauth.getStatus() == 1) {
			System.out.println("Get Request Token failed!");
			return;
		} else {
			String oauth_token = oauth.getOauth_token();

			String url = "http://open.t.qq.com/cgi-bin/authorize?oauth_token=" + oauth_token;

			System.out.println("Get verification code......");
			if (!java.awt.Desktop.isDesktopSupported()) {

				System.err.println("Desktop is not supported (fatal)");
				System.exit(1);
			}
			java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
			if (desktop == null || !desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {

				System.err.println("Desktop doesn't support the browse action (fatal)");
				System.exit(1);
			}
			try {
				desktop.browse(new URI(url));
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(1);
			} catch (URISyntaxException e) {
				e.printStackTrace();
				System.exit(1);
			}

			System.out.println("Input your verification code：");
			Scanner in = new Scanner(System.in);
			verify = in.nextLine();

			// 获取access token
			System.out.println("GetAccessToken......");
			oauth.setOauth_verifier(verify);
			oauth = auth.accessToken(oauth);
			System.out.println("Response from server：");

			if (oauth.getStatus() == 2) {
				System.out.println("Get Access Token failed!");
				return;
			} else {
				Fav_API tAPI = new Fav_API();
				// String response=tAPI.list_t(oauth,
				// WeiBoConst.ResultType.ResultType_Json, "20", "0", "0");
				// String response=tAPI.delt(oauth,
				// WeiBoConst.ResultType.ResultType_Json, "104502055372919");
				// String response=tAPI.addt(oauth,
				// WeiBoConst.ResultType.ResultType_Json, "104502055372919");
				Private_API private_API = new Private_API();

				String response = private_API.add(oauth, WeiBoConst.ResultType.ResultType_Json, "hello", "127.0.0.1", "", "", "BlueX_Chan");
				System.out.println("response:" + response);
			}
			in.close();
		}
	}

}
