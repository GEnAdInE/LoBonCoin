package com.project.dataController;

import static org.junit.jupiter.api.Assertions.*;

import com.project.model.Drink;
import com.project.model.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.project.model.Sugar;
import org.mockito.internal.matchers.Or;

import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderControllerTest {

    @BeforeAll
    void setUp()
    {
        ArrayList<Order> StubArray = new ArrayList<>();

        MockedStatic<OrderController> utils = Mockito.mockStatic(OrderController.class);
        utils.when(OrderController::getHistory).thenReturn(StubArray);
    }

    @Test
    void getHistory() {
        assertEquals((new ArrayList<Order>()).getClass(),OrderController.getHistory().getClass());
    }
}
