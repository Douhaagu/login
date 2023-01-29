package loginda.model;

public class user {
	private int id;
	private String email;
	private String name;
	private String password;
	
	public user() {
		
	}

	public user(String email, String name, String password) {
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "user [ email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
