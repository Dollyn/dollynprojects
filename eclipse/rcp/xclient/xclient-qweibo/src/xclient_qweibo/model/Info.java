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
	public static final int COMMENT = 7;// ����

	@Id
	private long id;
	/** ���� **/
	private String text = "";
	/** ԭʼ���� **/
	private String origtext = "";
	/** ת������ **/
	private int count;
	/** �������� **/
	private int mcount;
	/** ��Դ **/
	private String from = "������ҳ";

	String[] image = new String[] { "", "" };

	// video:{picurl:""",player:"",realurl:"",shorturl:"",title:""},
	// music:{author:"",url:"",title:""},
	/** �����˵��ʻ��� **/
	private String name;
	/** �������ǳ� */
	private String nick;
	String uid = "xxxxxx";
	// source:

	int type;
	int self;// 0--no; 1-- yes
	
	/** ����ʱ�� */
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