package de.thro.inf.prg3.a05.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShrubTest
{

    Shrub shruby;

    @BeforeEach
    void setUp() {
        shruby = new Shrub(3.7, "shruble", "Shruby the first");
    }

    @Test
    void TestColor() {
        assertEquals(PlantColor.GREEN, shruby.getColor());
    }

    @AfterEach
    void tearDown() {
        shruby = null;
    }
}