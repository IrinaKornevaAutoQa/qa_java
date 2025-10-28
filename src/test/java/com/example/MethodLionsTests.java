package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class MethodLionsTests {

    @Mock
    Feline feline;

    @Test
    public void getFoodAsPredator() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood(), "Самцы едят: 'Животные', 'Птицы', 'Рыба'");
    }

    @Test
    public void getKittensAsPredator() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самка", feline);
        assertEquals(3, lion.getKittens(), "У самки должно быть 3 львенка");
    }

    @Test
    public void negativeSex() {
        assertEquals("Используйте допустимые значения пола животного - самей или самка", assertThrows(Exception.class, () -> new Lion("Другое", feline)).getMessage());
    }
}
