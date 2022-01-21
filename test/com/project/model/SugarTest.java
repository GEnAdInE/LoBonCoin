package com.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SugarTest {
	
	Sugar sugarTest;

	@BeforeAll
	void setUp()
	{
		sugarTest = new Sugar(100);
	}
	
	@AfterAll
	void end()
	{
		sugarTest = null;
	}
	
    @Test
    void getQuantity() 
    {
    	assertsEquals(100,sugarTest.getQuantity());
    }

    @Test
    void setQuantity() {
    	sugarTest.setQuantity(500);
    	assertsEquals(500, sugarTest.getQuantity());
    }
}