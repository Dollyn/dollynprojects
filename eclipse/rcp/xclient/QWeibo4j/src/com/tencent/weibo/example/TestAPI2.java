/**
 * 源程序名称：TestAPI2.java
 * 软件著作权：恒生电子股份有限公司 版权所有
 * 系统名称：JRES Studio
 * 模块名称：QWeibo4j
 * 功能说明：$desc
 * 相关文档：
 * 作者：sundl
 */
package com.tencent.weibo.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import com.google.gson.Gson;
import com.tencent.weibo.api.Statuses_API;
import com.tencent.weibo.beans.OAuth;
import com.tencent.weibo.utils.OAuthClient;
import com.tencent.weibo.utils.WeiBoConst;

/**
 * 
 * @author sundl
 */
public class TestAPI2 {

	static String CACHE_FILE = "cache.properties";
	static String ACCESS_TOKEN = "access_token";
	static String ACCESS_TOKEN_SECRET = "access_token_secret";
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File(CACHE_FILE);
		
		Properties cache = new Properties();
		if (file.exists()) {
			cache.load(new FileReader(file));
		}
		
		OAuth oAuth = new OAuth();
		OAuthClient auth=new OAuthClient();

		String access_token = (String) cache.get(ACCESS_TOKEN);
		String access_token_secret = (String) cache.get(ACCESS_TOKEN_SECRET);
		
		if (access_token == null || access_token_secret == null) {
			
			try {
				// 获取request token
				auth.requestToken(oAuth);
				
				if (oAuth.getStatus() == 1) {
					System.err.println("request token error!");
					return;
				} 
				
				String oauth_token = oAuth.getOauth_token();
				String url = "http://open.t.qq.com/cgi-bin/authorize?oauth_token="	+ oauth_token;
				System.out.println("Get verification code......");
				System.out.println("URL:" + url);
				
		        System.out.println("Input your verification code：");
		        Scanner in = new Scanner(System.in);
		        String verify = in.nextLine(); 
		        
		        System.out.println("GetAccessToken......");
		        oAuth.setOauth_verifier(verify);
		        auth.accessToken(oAuth);
		        System.out.println("Response from server：");
		        

				if (oAuth.getStatus() == 2) {
					System.out.println("Get Access Token failed!");
					return;
				} else {
					cache.put(ACCESS_TOKEN, oAuth.getOauth_token());
					cache.put(ACCESS_TOKEN_SECRET, oAuth.getOauth_token_secret());
					cache.store(new FileOutputStream(file), null);
				}
				
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			oAuth.setOauth_token(access_token);
			oAuth.setOauth_token_secret(access_token_secret);
		}
				
//		Fav_API tAPI = new Fav_API();
//		// String response=tAPI.list_t(oauth,
//		// WeiBoConst.ResultType.ResultType_Json, "20", "0", "0");
//		// String response=tAPI.delt(oauth,
//		// WeiBoConst.ResultType.ResultType_Json, "104502055372919");
//		// String response=tAPI.addt(oauth,
//		// WeiBoConst.ResultType.ResultType_Json, "104502055372919");
//		Private_API private_API = new Private_API();
//
//		String response = private_API.add(oAuth, WeiBoConst.ResultType.ResultType_Json, "hello", "127.0.0.1", "", "", "BlueX_Chan");
//		System.out.println("response:" + response);

//		T_API t_api = new T_API();
//		try {
//			String str = t_api.show(oAuth, WeiBoConst.ResultType.ResultType_Json, "107557039679209");
//			System.out.println(str);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Statuses_API sapi = new Statuses_API();
		try {
			String timeline = sapi.home_timeline(oAuth,  WeiBoConst.ResultType.ResultType_Json, WeiBoConst.PageFlag.FIRST_PAGE, "0", "0");
			System.out.println(timeline);
			Gson gson = new Gson();
			TimeLineResult result = gson.fromJson(timeline, TimeLineResult.class);
			System.out.println(result.msg);
			for (TimeLineResult.Data.Info info : result.data.info) {
				System.out.println(info.text);
				if (info.source != null) {
					System.out.println("SOURCE:::  " + info.source.text);
				}
				System.out.println("===============================================================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
