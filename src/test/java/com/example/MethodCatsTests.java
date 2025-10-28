package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MethodCatsTests {

    @Mock
    Feline feline;

    @Test
    public void getDefaultSoundMeow() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound(), "Котики говорят 'Мяу'");
    }

    @Test
    public void getFoofAsPredator() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood(), "Кошки кушают: 'Животные', 'Птицы', 'Рыба'");
    }
}
