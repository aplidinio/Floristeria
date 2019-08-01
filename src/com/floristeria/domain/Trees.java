package com.floristeria.domain;

public class Trees extends Entity {

	@Override
	public void setProperty() {
		// TODO Auto-generated method stub
		super.setProperty();
	}

	double height;

	public Trees(int id, String name, double price, double height, int stock) {
		super(id, name, price, stock);
		this.height = height;
		
	}

	@Override
	public void price() {

	}

	@Override
	public void stock() {
	
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
