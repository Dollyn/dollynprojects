package xclient_qweibo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {
	
	@Id
	@GeneratedValue
	private long id;
	/** ����ͼ */
	private String picurl;
	/** ��������ַ */
	private String player;
	/** ��Ƶԭ��ַ */
	private String realurl;
	/** ��Ƶ�Ķ�url */
	private String shorturl;
	/** ��Ƶ���� */
	private String title;	
}