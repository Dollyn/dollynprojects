package xclient_qweibo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tweet {
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
	/** 图片URL列表 */
	String[] image = new String[] { "", "" };
	
	private Video video;
	private Music music;

	// video:{picurl:""",player:"",realurl:"",shorturl:"",title:""},
	// music:{author:"",url:"",title:""},
	/** 发表人的帐户名 **/
	private String name;//发表人帐户名
	/** 发表人昵称 */
	private String nick;//发表人昵称
	String openid = "xxxxxx";//用户唯一id，与name相对应
	// source:

	int type;//微博类型，1-原创发表，2-转载，3-私信，4-回复，5-空回，6-提及，7-评论
	int self;// 是否自已发的的微博，0-不是，1-是
	
	/** 发表时间 */
	long timestamp;//发表时间
	String head;//发表者头像url
	
	String location;//发表者所在地
	String country_code;//国家码（其他时间线一样）
	String province_code;//省份码（其他时间线一样）
	String city_code;//城市码（其他时间线一样）
	int isvip;//是否微博认证用户，0-不是，1-是
	String geo;//发表者地理信息
	int status;//微博状态，0-正常，1-系统删除，2-审核中，3-用户删除，4-根删除

	String emotionurl;//心情图片url
	int emotiontype;//心情类型
	Tweet source;//当type=2时，source即为源tweet
}