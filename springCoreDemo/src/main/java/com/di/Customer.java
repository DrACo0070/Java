package com.di;

public class Customer {
	
	private int id;
	private String fname;
	private String lname;
	private int age;
	
	
	public Customer(int id, String fname, String lname, int age) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
}
