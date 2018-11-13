package de.thro.inf.prg3.a05.model;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Peter Kurfer
 * Created on 11/2/17.
 */
class PlantBedTests {

    private PlantBed<Flower> flowerBed;
    private PlantBed<Shrub> shrubBed;

    @BeforeEach
    void setup() {
        flowerBed = new PlantBed<>();
        shrubBed = new PlantBed<>();

        flowerBed.add(new Flower(0.4, "Rosa", "Golden Celebration", PlantColor.YELLOW));
        flowerBed.add(new Flower(0.5, "Rosa", "Abracadabra", PlantColor.RED));
        flowerBed.add(new Flower(0.3, "Rosa", "Golden Celebration", PlantColor.YELLOW));
        flowerBed.add(new Flower(0.35, "Rosa", "Golden Celebration", PlantColor.YELLOW));
        flowerBed.add(new Flower(0.35, "Rosa", "Abracadabra", PlantColor.RED));
        flowerBed.add(new Flower(0.35, "Rosa", "Rosa chinensis", PlantColor.ORANGE));

        shrubBed.add(new Shrub(1.5, "Buxus", "Buxus sempervirens"));
        shrubBed.add(new Shrub(1.1, "Buxus", "Buxus sempervirens"));
        shrubBed.add(new Shrub(1.2, "Buxus", "Buxus sempervirens"));
        shrubBed.add(new Shrub(1.4, "Buxus", "Buxus sempervirens"));
    }

    @Test
    void testCreateEmptyPlantBed() {
        PlantBed<Flower> plantBed = new PlantBed<>();
        assertEquals(0, plantBed.size());
    }

    @Test
    void testGetSize() {
        assertEquals(4, shrubBed.size());
        assertEquals(6, flowerBed.size());
    }

    @Test
    void testGetPlantsByColorYellow() {
        SimpleList<Flower> flowers = flowerBed.getPlantsByColor(PlantColor.YELLOW);
        assertEquals(3, flowers.size());
        for(Flower f : flowers) {
            assertEquals(PlantColor.YELLOW, f.getColor());
        }
    }

    @Test
    void testGetPlantsByColorRed() {
        SimpleList<Flower> flowers = flowerBed.getPlantsByColor(PlantColor.RED);
        assertEquals(2, flowers.size());
        for(Flower f : flowers) {
            assertEquals(PlantColor.RED, f.getColor());
        }
    }

    @Test
    void testGetPlantsByColorGreen() {
        SimpleList<Flower> flowers = flowerBed.getPlantsByColor(PlantColor.GREEN);
        assertEquals(0, flowers.size());

        SimpleList<Shrub> shrubs = shrubBed.getPlantsByColor(PlantColor.GREEN);
        assertEquals(4, shrubs.size());
    }
}