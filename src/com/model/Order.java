package com.model;

import java.time.*;

public class Order 
{
	private Drink drink;
	
	private Sugar sugar;
	
	private Water water;
	
	private LocalDateTime date;

	public Order() {
		super();
	}

	public Order(Drink drink, Sugar sugar, Water water, LocalDateTime date) {
		super();
		this.drink = drink;
		this.sugar = sugar;
		this.water = water;
		this.date = date;
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
}
