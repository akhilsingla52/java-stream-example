package com.stream.dao;

public class Supplier {
	String name;
	String company;
	
	public Supplier() {
		this("","");
	}
	
	public Supplier(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Supplier [name=" + name + ", company=" + company + "]";
	}
}
