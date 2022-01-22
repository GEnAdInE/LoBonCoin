package com.project.model;

import java.io.*;

public class Sugar implements Serializable  
{
	private static final long serialVersionUID = -2576563989239538392L;

	@Override
	public String toString() {
		return "Sugar [quantity=" + quantity + "]";
	}

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

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Sugar))
		{
			return false;
		}

		if(((Sugar) obj).quantity == this.quantity){
			return true;
		}
		else
		{
			return false;
		}
	}

}
