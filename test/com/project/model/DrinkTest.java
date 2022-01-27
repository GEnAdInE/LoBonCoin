package com.project.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest{

    Drink myTestDrink;


	@BeforeEach
	void setUp()
	{
		myTestDrink = new Drink(1,"Toto","Des",5);
	}
	
	@AfterEach
	void end()
	{
		myTestDrink = null;
	}
	
    @Test
    void getName() {
        assertEquals("Toto",myTestDrink.getName());
    }

    @Test
    void getDescription() {
        assertEquals("Des",myTestDrink.getDescription());
    }

    @Test
    void getPrice() {
        assertEquals(5,myTestDrink.getPrice());
    }

    @Test
    void setName() {
        myTestDrink.setName("Titi");
        assertEquals("Titi",myTestDrink.getName());
        myTestDrink.setName("Toto");
    }

    @Test
    void setDescription() {
        myTestDrink.setDescription("Das");
        assertEquals("Das",myTestDrink.getDescription());
        myTestDrink.setDescription("Des");
    }

    @Test
    void setPrice() {
        myTestDrink.setPrice(69);
        assertEquals(69,myTestDrink.getPrice());
        myTestDrink.setPrice(5);
    }

    @Test
    void getIdDrink() {
        assertEquals(1,myTestDrink.getIdDrink());
    }

    @Test
    void setIdDrink() {
        myTestDrink.setIdDrink(89);
        assertEquals(89,myTestDrink.getIdDrink());
        myTestDrink.setIdDrink(1);
    }
    
    @Test
    void equals()
    { 	
    	assertTrue(myTestDrink.equals(new Drink(1,"Toto","Des",5)));
   	}
}