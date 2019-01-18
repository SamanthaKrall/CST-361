package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	private String userID;
	private String password;
	private String location;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User() {
		userID = "Skrall";
		password = "Cst-361";
		location = "Phoenix";
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
