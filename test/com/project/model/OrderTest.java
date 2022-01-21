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
    	assertEquals(false,orderTest.isCanceled());
    }

    @Test
    void setCanceled() 
    {
    	orderTest.setCanceled(true);
    	assertEquals(true, orderTest.isCanceled());
    }

    @Test
    void getDrink() 
    {
    	assertEquals(new Drink(0, "drink", "drinkDesc", 1), orderTest.getDrink());
    }

    @Test
    void getSugar() {
    	assertEquals(new Sugar(10), orderTest.getSugar());
    }

    @Test
    void getWater() 
    {
    	assertEquals(new Water(75), orderTest.getWater());
    }

    @Test
    void getDate() {
    	assertEquals(LocalDateTime.MIN, orderTest.getDate());
    }

    @Test
    void setDrink() {
    	orderTest.setDrink(new Drink(1,"drinkSet", "drinkSetDesc", 2));
    	assertEquals(new Drink(1,"drinkSet", "drinkSetDesc", 2), orderTest.getDrink());
    }

    @Test
    void setSugar() 
    {
    	orderTest.setSugar(new Sugar(5));
    	assertEquals(new Sugar(5), orderTest.getSugar());
    }

    @Test
    void setWater() 
    {
    	orderTest.setWater(nes Water(35));
    	assertEquals(new Water(35), orderTest.getWater());
    }

    @Test
    void setDate() {
    	orderTest.setDate(LocalDateTime.MAX);
    	assertEquals(LocalDateTime.MAX, orderTest.getDate());
    }

    @Test
    void getPrice() {
    	assertEquals(1,orderTest.getPrice());
    }

    @Test
    void setPrice() {
    	orderTest.setPrice(2);
    	assertEquals(2, orderTest.getPrice());
    }
}