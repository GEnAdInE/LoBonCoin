package com.project.model;

import java.io.*;

public class Drink implements Serializable
{
	private static final long serialVersionUID = 2853331064312361885L;

	private int idDrink;
	
	private String name;
	
	private String description;
	
	private double price;

	public Drink() {
		super();
	}

	public Drink(int idDrink, String name, String description, double price) {
		super();
		this.idDrink = idDrink;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getIdDrink() {
		return idDrink;
	}

	public void setIdDrink(int idDrink) {
		this.idDrink = idDrink;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drink [idDrink=" + idDrink + ", name=" + name + ", description=" + description + ", price=" + price
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Drink))
		{
			return false;
		}

		if(((Drink) obj).description.equals(this.description) && ((Drink) obj).idDrink == this.idDrink && ((Drink) obj).name.equals(this.name) && ((Drink) obj).price == this.price){
			return true;
		}
		else
		{
			return false;
		}
	}
}
