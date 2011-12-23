package xclient_qweibo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Video {
	
	/** 缩略图 */
	@Id
	private String picurl;
	/** 播放器地址 */
	private String player;
	/** 视频原地址 */
	private String realurl;
	/** 视频的短url */
	private String shorturl;
	/** 视频标题 */
	private String title;	
}