package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodFelinesParamTests {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1, 2, 5})
    public void getKittensQuantity(int q) {
        Feline feline = new Feline();
        assertEquals(q, feline.getKittens(q), "Количество малышей должно равняться " + q);
    }
}
