package com.project.model;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class SugarTest {

	Sugar sugarTest;

	@BeforeEach
	void setUp()
	{
		sugarTest = new Sugar(100);
	}
	
	@AfterEach
	void end()
	{
		sugarTest = null;
	}
	
    @Test
    void getQuantity() 
    {
    	assertEquals(100,sugarTest.getQuantity());
    }

    @Test
    void setQuantity() {
    	sugarTest.setQuantity(500);
    	assertEquals(500, sugarTest.getQuantity());
    	sugarTest.setQuantity(100);
    }
    
    @Test
    void equals()
    {
    	assertTrue(sugarTest.equals(new Sugar(100)));
    }
}