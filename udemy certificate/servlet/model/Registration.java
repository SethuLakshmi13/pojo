package model;


public class Registration {
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private int ages;
	private String email;
	private String phonenumber;
	private String address;
	private String country;
	private String hobbies;
	public Registration(String firstName, String lastName, String dateOfBirth, String gender, int ages,
			String email, String phonenumber, String address, String country, String hobbies) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.ages = ages;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.country = country;
		this.hobbies = hobbies;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAges() {
		return ages;
	}

	public void setAges(int ages) {
		this.ages = ages;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "RegistrationServlets [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", ages=" + ages + ", email=" + email + ", phonenumber="
				+ phonenumber + ", address=" + address + ", country=" + country + ", hobbies=" + hobbies + "]";
	}
	
       

}
