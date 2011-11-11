package xclient.timeline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

/**
 * 
 * @author dollyn
 */
public class TimeLineResult {

	int ret;
	String msg;
	Data data;
	
	public static class Data {
		long timestamp;
		int hasnext;
		List<Info> info;
		Map<String, String> user;
	}
	
	public static class Info {
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
		
//		video:{picurl:""",player:"",realurl:"",shorturl:"",title:""},
//		music:{author:"",url:"",title:""},
		String name="abc";
		String nick ="abcd";
		String uid="xxxxxx";
//		source:
		
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
		result.data = new Data();
		result.msg = "OK";
		result.data.info = new ArrayList<Info>();
		Gson gson = new Gson();
		System.out.println(gson.toJson(result));
	}
}
