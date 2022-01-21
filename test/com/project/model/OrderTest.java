package com.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

class OrderTest {

	Order orderTest;

	@BeforeAll
	void setUp()
	{
		Drink drink = new Drink(0, "drink", "drinkDesc", 1);
		Water water = new Water(75);
		Sugar sugar = new Sugar(10);
		
		orderTest = new Order(drink, water, sugar, 1, LocalDateTime.MIN, false);
	}
	
	@AfterAll
	void end()
	{
		orderTest = null;
	}
	
    @Test
    void isCanceled() 
    {
    	assertsEquals(false,orderTest.isCanceled());
    }

    @Test
    void setCanceled() 
    {
    	orderTest.setCanceled(true);
    	assertsEquals(true, orderTest.isCanceled());
    }

    @Test
    void getDrink() 
    {
    	assertsEquals(new Drink(0, "drink", "drinkDesc", 1), orderTest.getDrink());
    }

    @Test
    void getSugar() {
    	assertsEquals(new Sugar(10), orderTest.getSugar());
    }

    @Test
    void getWater() 
    {
    	assertsEquals(new Water(75), orderTest.getWater());
    }

    @Test
    void getDate() {
    	assertsEquals(LocalDateTime.MIN, orderTest.getDate());
    }

    @Test
    void setDrink() {
    	orderTest.setDrink(new Drink(1,"drinkSet", "drinkSetDesc", 2));
    	assertsEquals(new Drink(1,"drinkSet", "drinkSetDesc", 2), orderTest.getDrink());
    }

    @Test
    void setSugar() 
    {
    	orderTest.setSugar(new Sugar(5));
    	assertsEquals(new Sugar(5), orderTest.getSugar());
    }

    @Test
    void setWater() 
    {
    	orderTest.setWater(nes Water(35));
    	assertsEquals(new Water(35), orderTest.getWater());
    }

    @Test
    void setDate() {
    	orderTest.setDate(LocalDateTime.MAX);
    	assertsEquals(LocalDateTime.MAX, orderTest.getDate());
    }

    @Test
    void getPrice() {
    	assertsEquals(1,orderTest.getPrice());
    }

    @Test
    void setPrice() {
    	orderTest.setPrice(2);
    	assertsEquals(2, orderTest.getPrice());
    }
}