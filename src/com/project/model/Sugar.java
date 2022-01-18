package model;

import java.io.*;

public class Sugar implements Serializable  
{
	private int quantity;
	
	public Sugar() {
		super();
	}

	public Sugar(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
