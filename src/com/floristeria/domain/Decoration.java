package com.floristeria.domain;

public class Decoration extends Entity {

	@Override
	public void setProperty() {
		// TODO Auto-generated method stub
		super.setProperty();
	}

	boolean isWood; // wood or plastic

	public Decoration(int id, String name, double price, boolean isWood, int stock) {
		super(id, name, price, stock);
		this.isWood = isWood;
		
	}

	@Override
	public void price() {
		

	}
	
	@Override
	public void stock() {
	
		
	}

	public boolean isWood() {
		return isWood;
	}

	public void setWood(boolean isWood) {
		this.isWood = isWood;
	}

}
