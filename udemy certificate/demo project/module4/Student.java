package module4;

public class Student {

	private long employeeId;
	private String name;
	private static final String COHORT_CODE = "CHNAJ19004";

	public Student(long employeeId, String name) {

		this.employeeId = employeeId;
		this.name = name;

	}

	public long getid() {
		return this.employeeId;
	}

	public void setid(long employeeId) {

		this.employeeId = employeeId;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcourseName() {
		return this.COHORT_CODE;
	}
	

}
