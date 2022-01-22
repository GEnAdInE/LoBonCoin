package com.project.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SugarTest {

	@Mock
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
    }
}