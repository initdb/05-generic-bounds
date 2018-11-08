package de.thro.inf.prg3.a05.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest
{
    Flower sunny;

    @BeforeEach
    void setUp() {
        sunny = new Flower(2.0, "sunflowers", "fieldflowers", PlantColor.YELLOW);
    }

    @Test
    void TestColor() {
        assertEquals(PlantColor.YELLOW, sunny.getColor());

        assertThrows(IllegalArgumentException.class,
                () -> new Flower(3.6,"gras", "no flower", PlantColor.GREEN));
    }

    @AfterEach
    void tearDown() {
        sunny = null;
    }
}