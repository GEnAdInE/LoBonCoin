package com.project.dataController;

import com.project.model.Drink;
import com.project.model.Water;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DrinkControllerTest {

    @BeforeAll
    void setUp()
    {
        ArrayList<Drink> StubArray = new ArrayList<>();
        StubArray.add(new Drink(1,"coffee","Black bresilian coffee.",0.8));
        StubArray.add(new Drink(2,"tea","Green indian tea.",1));

        MockedStatic<DrinkController> utils = Mockito.mockStatic(DrinkController.class);
        utils.when(DrinkController::getAvailableDrink).thenReturn(StubArray);
    }
    @Test
    void getAvailableDrink() {
        ArrayList<Drink> Toto = new ArrayList<>();
        Toto.add(new Drink(1,"coffee","Black bresilian coffee.",0.8));
        Toto.add(new Drink(2,"tea","Green indian tea.",1));

        assertArrayEquals(Toto.toArray(),DrinkController.getAvailableDrink().toArray());
    }
}