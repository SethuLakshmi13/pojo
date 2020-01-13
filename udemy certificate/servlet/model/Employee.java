package model;

import java.util.Date;

public class Employee {
	private long id;
	private String name;
	private String gender;
	private Date date;
	private String fullTime;
	private String department;
	private long salary;
	public Employee(long id, String name, String gender, Date date, String fullTime, String department,
			long salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.fullTime = fullTime;
		this.department = department;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFullTime() {
		return fullTime;
	}
	public void setFullTime(String fullTime) {
		this.fullTime = fullTime;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	


}
