package com.floristeria.domain;

public class Trees extends Entity {

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
	
	@Override
	public String toString() {
		
		return super.toString()+ "| Al�ada: " + this.height + " m";
	}

}
