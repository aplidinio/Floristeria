package com.floristeria.domain;

public class Flowers extends Entity {

	String color;

	public Flowers(int id, String name, double price, String color, int stock) {
		super(id, name, price, stock);
		this.color = color;
	
	}

	@Override
	public void price() {

	}
	
	@Override
	public void stock() {
	
		
	}

	public String getColor() {
		return color;
	}

	@Override
	public void setProperty() {
		// TODO Auto-generated method stub
		super.setProperty();
	}

	public void setColor(String color) {
		this.color = color;
	}

}
