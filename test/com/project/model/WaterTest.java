package com.project.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WaterTest {

	Water waterTest;

	@BeforeEach
	void setUp()
	{
		waterTest = new Water(100);
	}
	
	@AfterEach
	void end()
	{
		waterTest = null;
	}
	
	@Test
	void Water()
	{
		Water water = new Water(100);
		
		assertTrue(water instanceof Water);
    	
    	assertTrue(waterTest.equals(water));
	}
	
    @Test
    void getQuantity() 
    {
    	assertEquals(100,waterTest.getQuantity());
    }

    @Test
    void setQuantity() {
    	waterTest.setQuantity(500);
    	assertEquals(500, waterTest.getQuantity());
    	waterTest.setQuantity(100);
    }
    
    @Test
    void equals()
    {
    	assertTrue(waterTest.equals(new Water(100)));
    }
}