package xclient_qweibo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * �ʺŵ��ǳƵ�ӳ���ϵ
 */
@Entity
public class Usr {

	/** �ʺ�(id) */
	@Id
	private String name;
	/** �ǳ� */
	private String nick;
	
}
