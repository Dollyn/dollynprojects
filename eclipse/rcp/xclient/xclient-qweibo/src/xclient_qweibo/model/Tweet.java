package xclient_qweibo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tweet {
//	public static final int ORIGINAL = 1;
//	public static final int RT = 2;
//	public static final int PRIVATE = 3;
//	public static final int REPLY = 4;
//	public static final int EMPTY_REPLY = 5;
//	public static final int MENTION = 6;
//	public static final int COMMENT = 7;// ����

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
	@Column(name="frm")
	private String from = "������ҳ";
	/** ͼƬURL�б� */
	String[] image = new String[] { "", "" };
	
	private Video video;
	private Music music;

	// video:{picurl:""",player:"",realurl:"",shorturl:"",title:""},
	// music:{author:"",url:"",title:""},
	/** �����˵��ʻ��� **/
	private String name;//�������ʻ���
	/** �������ǳ� */
	private String nick;//�������ǳ�
	String openid = "xxxxxx";//�û�Ψһid����name���Ӧ
	// source:

	int type;//΢�����ͣ�1-ԭ������2-ת�أ�3-˽�ţ�4-�ظ���5-�ջأ�6-�ἰ��7-����
	int self;// �Ƿ����ѷ��ĵ�΢����0-���ǣ�1-��
	
	/** ����ʱ�� */
	long timestamp;//����ʱ��
	String head;//������ͷ��url
	
	String location;//���������ڵ�
	String country_code;//�����루����ʱ����һ����
	String province_code;//ʡ���루����ʱ����һ����
	String city_code;//�����루����ʱ����һ����
	int isvip;//�Ƿ�΢����֤�û���0-���ǣ�1-��
	String geo;//�����ߵ�����Ϣ
	int status;//΢��״̬��0-������1-ϵͳɾ����2-����У�3-�û�ɾ����4-��ɾ��

	String emotionurl;//����ͼƬurl
	int emotiontype;//��������
	Tweet source;//��type=2ʱ��source��ΪԴtweet
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getOrigtext() {
		return origtext;
	}
	public void setOrigtext(String origtext) {
		this.origtext = origtext;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMcount() {
		return mcount;
	}
	public void setMcount(int mcount) {
		this.mcount = mcount;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String[] getImage() {
		return image;
	}
	public void setImage(String[] image) {
		this.image = image;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getSelf() {
		return self;
	}
	public void setSelf(int self) {
		this.self = self;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public int getIsvip() {
		return isvip;
	}
	public void setIsvip(int isvip) {
		this.isvip = isvip;
	}
	public String getGeo() {
		return geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getEmotionurl() {
		return emotionurl;
	}
	public void setEmotionurl(String emotionurl) {
		this.emotionurl = emotionurl;
	}
	public int getEmotiontype() {
		return emotiontype;
	}
	public void setEmotiontype(int emotiontype) {
		this.emotiontype = emotiontype;
	}
	public Tweet getSource() {
		return source;
	}
	public void setSource(Tweet source) {
		this.source = source;
	}	
	
}