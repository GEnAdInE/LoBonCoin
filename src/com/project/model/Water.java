package model;

import java.io.*;

public class Water implements Serializable
{
private int quantity;
	
	public Water() {
		super();
	}

	public Water(int quantity) {
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
