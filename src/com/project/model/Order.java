package com.project.model;

import java.io.*;
import java.time.*;

public class Order implements Serializable
{
	private static final long serialVersionUID = 2095220863701218590L;

	private Drink drink;
	
	private Sugar sugar;
	
	private Water water;
	
	private double price;
	
	private LocalDateTime date;
	
	private boolean canceled;

	public Order() {
		super();
	}

	public Order(Drink drink, Sugar sugar, Water water, double price, LocalDateTime date, boolean canceled) {
		super();
		this.drink = drink;
		this.sugar = sugar;
		this.water = water;
		this.price = price;
		this.date = date;
		this.canceled = canceled;
	}

	public boolean isCanceled() {
		return canceled;
	}

	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}

	public Drink getDrink() {
		return drink;
	}

	public Sugar getSugar() {
		return sugar;
	}

	public Water getWater() {
		return water;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}

	public void setWater(Water water) {
		this.water = water;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [drink=" + drink + ", sugar=" + sugar + ", water=" + water + ", price=" + price + ", date=" + date
				+ ", canceled=" + canceled + "]";
	}
}
