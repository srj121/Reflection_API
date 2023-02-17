package springmicroservice.office.bean;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Office {
	
	private String email;
	private int workDays;
	private int leaves;
	private int salary;

	public Office(String email, int workDays, int leaves, int salary) {
		super();
		this.email = email;
		this.workDays = workDays;
		this.leaves = leaves;
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	public int getleaves() {
		return leaves;
	}

	public void setleaves(int leaves) {
		this.leaves = leaves;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
