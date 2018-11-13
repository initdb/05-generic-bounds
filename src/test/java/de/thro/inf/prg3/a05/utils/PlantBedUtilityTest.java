package de.thro.inf.prg3.a05.utils;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.model.Flower;
import de.thro.inf.prg3.a05.model.PlantBed;
import de.thro.inf.prg3.a05.model.PlantColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Peter Kurfer
 * Created on 11/2/17.
 */
class PlantUtilityTests {

    private PlantBed<Flower> flowerBed;

    @BeforeEach
    void setup() {
        flowerBed = new PlantBed<>();

        flowerBed.add(new Flower(0.4, "Rosa", "Golden Celebration", PlantColor.YELLOW));
        flowerBed.add(new Flower(0.5, "Rosa", "Abracadabra", PlantColor.RED));
        flowerBed.add(new Flower(0.3, "Rosa", "Golden Celebration", PlantColor.YELLOW));
        flowerBed.add(new Flower(0.35, "Rosa", "Golden Celebration", PlantColor.YELLOW));
        flowerBed.add(new Flower(0.35, "Rosa", "Abracadabra", PlantColor.RED));
        flowerBed.add(new Flower(0.35, "Rosa", "Rosa chinensis", PlantColor.ORANGE));
    }

    @Test
    void testSplitByBedByColorResultingSize() {
        Map<PlantColor, SimpleList<Flower>> split = PlantBedUtility.splitBedByColor(flowerBed);
        assertEquals(3, split.keySet().size());
    }

    @Test
    void testSplitByBedByColorPureness() {
        Map<PlantColor, SimpleList<Flower>> split = PlantBedUtility.splitBedByColor(flowerBed);
        for (Flower f : split.get(PlantColor.YELLOW)) {
            assertEquals(PlantColor.YELLOW, f.getColor());
        }
    }
}