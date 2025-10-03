package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MethodAlexLionTests {

    @Mock
    Predator predator;

    @Test
    public void friendsOfAlexLion() throws Exception {
        AlexLion alex = new AlexLion(predator);
        assertEquals(List.of("Марти","Глория", "Мелман"), alex.getFriends(), "У льва Алекса трое друзей: 'Марти','Глория', 'Мелман'");
    }

    @Test
    public void homeOfAlexLion() throws Exception {
        AlexLion alex = new AlexLion(predator);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving(), "Дом льва Алекса это - 'Нью-Йоркский зоопарк'");
    }

    @Test
    public void alexHasNotKittens() throws Exception {
        AlexLion alex = new AlexLion(predator);
        assertEquals(0, alex.getKittens(), "У льва Алекса нет львят");
    }
}
