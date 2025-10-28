package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodFelinesTests {

    @Test
    public void eatMeatReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat(), "Пища для этого семейства должна равняться: 'Животные', 'Птицы', 'Рыба'");
    }

    @Test
    public void familyIsFeline() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily(), "Это семейство: 'Кошачьи'");
    }

    @Test
    public void defaultKittensIs1() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(), "Количество малышей должно равняться 1");
    }

}
