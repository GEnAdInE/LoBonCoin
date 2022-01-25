package com.project.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WaterTest {

	@Mock
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
		assertTrue(new Water(100) instanceof Water);
    	
    	assertTrue(waterTest.equals(new Water(100)));
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
    }
    
    @Test
    void equals()
    {
    	assertTrue(waterTest.equals(new Water(100)));
    }
}