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
}