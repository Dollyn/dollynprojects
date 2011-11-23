package xclient_qweibo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Video {
	@Id
	private String picurl;
	private String player;
	private String realurl;
	private String shorturl;
}