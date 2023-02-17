package com.springmicroservice.office.bean;


public class Office {
	private String email;
	private int workDays;
	private int Leaves;
	private int salary;
	public Office(String email, int workDays, int leaves, int salary) {
		super();
		this.email = email;
		this.workDays = workDays;
		Leaves = leaves;
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
	public int getLeaves() {
		return Leaves;
	}
	public void setLeaves(int leaves) {
		Leaves = leaves;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
}
