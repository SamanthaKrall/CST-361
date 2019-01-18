package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	private String firstname;
	private String lastname;
	public User() {
		firstname = " ";
		lastname = " ";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
