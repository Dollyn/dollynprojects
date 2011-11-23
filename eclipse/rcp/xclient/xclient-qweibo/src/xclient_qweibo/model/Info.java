package xclient_qweibo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Info {
	public static final int ORIGINAL = 1;
	public static final int RT = 2;
	public static final int PRIVATE = 3;
	public static final int REPLY = 4;
	public static final int EMPTY_REPLY = 5;
	public static final int MENTION = 6;
	public static final int COMMENT = 7;// 评论

	@Id
	private long id;
	/** 内容 **/
	private String text = "";
	/** 原始内容 **/
	private String origtext = "";
	/** 转播次数 **/
	private int count;
	/** 点评次数 **/
	private int mcount;
	/** 来源 **/
	private String from = "来自网页";

	String[] image = new String[] { "", "" };

	// video:{picurl:""",player:"",realurl:"",shorturl:"",title:""},
	// music:{author:"",url:"",title:""},
	/** 发表人的帐户名 **/
	private String name;
	/** 发表人昵称 */
	private String nick;
	String uid = "xxxxxx";
	// source:

	int type;
	int self;// 0--no; 1-- yes
	
	/** 发表时间 */
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