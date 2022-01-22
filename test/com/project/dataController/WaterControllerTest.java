package com.project.dataController;

import com.project.model.Water;
import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WaterControllerTest {


    @BeforeAll
    void setUp()
    {
        MockedStatic<WaterController> utils = Mockito.mockStatic(WaterController.class);
        utils.when(WaterController::getWatterFromFile).thenReturn(new Water(5));
        utils.when(WaterController::getWaterAvailable).thenReturn(5);
        utils.when(WaterController::isWaterAvailable).thenReturn(true);
    }



    @Test
    void isWaterAvailable() {
        assertTrue(WaterController.isWaterAvailable());
    }

    @Test
    void getWaterAvailable() {
        assertEquals(5,WaterController.getWaterAvailable());
    }

    @Test
    void getWatterFromFile(){
        assertEquals(new Water(5),WaterController.getWatterFromFile());
    }


}