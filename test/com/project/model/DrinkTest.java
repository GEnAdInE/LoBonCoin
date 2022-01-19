package com.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {
    Drink myTestDrink = new Drink(1,"Toto","Des",5);

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
    }

    @Test
    void setDescription() {
        myTestDrink.setDescription("Das");
        assertEquals("Das",myTestDrink.getDescription());
    }

    @Test
    void setPrice() {
        myTestDrink.setPrice(69);
        assertEquals(69,myTestDrink.getPrice());
    }

    @Test
    void getIdDrink() {
        assertEquals(1,myTestDrink.getIdDrink());
    }

    @Test
    void setIdDrink() {
        myTestDrink.setIdDrink(89);
        assertEquals(89,myTestDrink.getIdDrink());
    }
}