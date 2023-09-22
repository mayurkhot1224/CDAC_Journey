package com.code;

public enum MyColors {

	WHITE(1000), BLACK(4000), GRAY(2000), SILVER(3000), RED(5000);

	// convert all in lowercase
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.name() + price;
	}

	private int price;

	private MyColors(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
