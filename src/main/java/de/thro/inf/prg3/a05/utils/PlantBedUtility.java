package de.thro.inf.prg3.a05.utils;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.collections.SimpleListImpl;
import de.thro.inf.prg3.a05.model.Plant;
import de.thro.inf.prg3.a05.model.PlantBed;
import de.thro.inf.prg3.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peter Kurfer
 * Created on 11/2/17.
 */
public abstract class PlantBedUtility {

    private PlantBedUtility() {
    }

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<? extends T> plantBed) {
        Map<PlantColor, SimpleList<T>> result = new HashMap<>();

        for (T plant : plantBed.getPlants()) {
            /* if the result does not contain the color of the plant
             * insert the color and a new empty list */
            if (!result.containsKey(plant.getColor())) {
                result.put(plant.getColor(), new SimpleListImpl<>());
            }
            /* get the corresponding list and add the current plant */
            result.get(plant.getColor()).add(plant);
        }

        return result;
    }

    //shortest variant
    public static <T extends Plant> Map<PlantColor, SimpleList<? super T>> splitBedByColor2(PlantBed<? super T> plantBed) {
        Map<PlantColor, SimpleList<? super T>> result = new HashMap<>();
        /* iterate the enum values */
        for (PlantColor color : PlantColor.values()) {
            /* get all plants of the current color */
            result.put(color, plantBed.getPlantsByColor(color));
        }
        return result;
    }
}
