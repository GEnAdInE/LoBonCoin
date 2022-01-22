package com.project.model;

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


	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Water))
		{
			return false;
		}

		if(((Water) obj).quantity == this.quantity){
			return true;
		}
		else
		{
			return false;
		}
	}
}
