package com.project.dataController;

import com.project.model.Sugar;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class SugarControllerTest {

	MockedStatic<SugarController> sugarController;
    @BeforeAll
    void setUp()
    {
    	sugarController = Mockito.mockStatic(SugarController.class);
        sugarController.when(SugarController::getSugarFromFile).thenReturn(new Sugar(100));
        sugarController.when(SugarController::isSugarAvailable).thenReturn(true);
        sugarController.when(SugarController::getSugarAvailable).thenReturn(100);
    }

    @Test
    void isSugarAvailable() {
        assertTrue(SugarController.isSugarAvailable());
    }

    @Test
    void getSugarFromFile()
    {
    	assertEquals(new Sugar(100), SugarController.getSugarFromFile());
    }
    
    @Test
    void getSugarAvailable()
    {
    	assertEquals(100, SugarController.getSugarAvailable());
    }
}