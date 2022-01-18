package model;

import java.io.*;

public class Water implements Serializable
{
	
	private static final long serialVersionUID = 7298842972573825230L;
	
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

	@Override
	public String toString() {
		return "Water [quantity=" + quantity + "]";
	}
}
