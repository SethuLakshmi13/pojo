package model;

public class PersonalInfo {
	private String name;
	private String email;
	private boolean preference;
	public PersonalInfo(String name, String email, boolean preference) {
		super();
		this.name = name;
		this.email = email;
		this.preference = preference;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getPreference() {
		return preference;
	}
	public void setPreference(boolean preference) {
		this.preference = preference;
	}

}
