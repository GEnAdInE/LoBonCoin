package com.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class WaterTest {

	Water waterTest;

	@BeforeAll
	void setUp()
	{
		waterTest = new Water(100);
	}
	
	@AfterAll
	void end()
	{
		waterTest = null;
	}
	
    @Test
    void getQuantity() 
    {
    	assertsEquals(100,waterTest.getQuantity());
    }

    @Test
    void setQuantity() {
    	waterTest.setQuantity(500);
    	assertsEquals(500, waterTest.getQuantity());
    }
}