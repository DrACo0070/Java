package com.di;

public class Car {
	
	private String color;
	private int price;
	private String company;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", company=" + company + "]";
	}

}
