package shamli.jerseyproject.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class staff {
	
	private long id;
	private String firstname;
	private String lastname;
	public staff() {
		
	}
	public staff(long l, String firstname, String lastname, Date created) {
		super();
		this.id = l;
		this.firstname = firstname;
		this.setLastname(lastname);
		this.created = new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	private Date created;

}
