/**
 * 源程序名称：TimeLineResult.java
 * 软件著作权：恒生电子股份有限公司 版权所有
 * 系统名称：JRES Studio
 * 模块名称：QWeibo4j
 * 功能说明：$desc
 * 相关文档：
 * 作者：sundl
 */
package com.tencent.weibo.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

/**
 * 
 * @author sundl
 */
public class TimeLineResult {

	int ret;
	String msg;
	Data data;
	
	class Data {
		long timestamp;
		int hasnext;
		List<Info> info;
		Map<String, String> user;
		
		class Info {
			public static final int ORIGINAL = 1;
			public static final int RT = 2;
			public static final int PRIVATE = 3;
			public static final int REPLY = 4;
			public static final int EMPTY_REPLY = 5;
			public static final int MENTION = 6;
			public static final int COMMENT = 7;// 评论
			
			String text="";
			String origtext="";
			int count=2;
			int mcount=2;
			String from="来自网页";
			long id=7987543214334L;
			String[] image=new String[]	{"", ""};
			
//			video:{picurl:""",player:"",realurl:"",shorturl:"",title:""},
//			music:{author:"",url:"",title:""},
			String name="abc";
			String nick ="abcd";
			String uid="xxxxxx";
//			source:
			
			int type;
			int self;// 0--no;  1-- yes
			long timestamp;
			String head;
			String location;
			String country_code;
			String province_code;
			String city_code;
			int isvip;
			String geo;
			int status;
			
			Info source;
		}
	}
	
	public static class Video {
		String picurl;
		String player;
		String realurl;
		String shorturl;
	}
	
	public static class Music {
		String author;
		String url;
		String title;
	}
	
	public static void main(String[] args) {
		TimeLineResult result = new TimeLineResult();
		result.data = result.new Data();
		result.msg = "OK";
		result.data.info = new ArrayList<TimeLineResult.Data.Info>();
		Gson gson = new Gson();
		System.out.println(gson.toJson(result));
	}
}
