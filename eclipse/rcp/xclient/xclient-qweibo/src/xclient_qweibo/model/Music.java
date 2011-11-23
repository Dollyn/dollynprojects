package xclient_qweibo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
	String author;
	@Id
	String url;
	String title;
}