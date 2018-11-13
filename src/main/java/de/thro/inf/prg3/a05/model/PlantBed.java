package de.thro.inf.prg3.a05.model;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant>
{
    private final SimpleList<T> plants;

    public PlantBed() {
        plants = new SimpleListImpl<>();
    }

    public void add(T plant){
        plants.add(plant);
    }

    public int size(){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color){
        return plants.filter(p -> p.getColor().equals(color));
    }

    // not tested wtf is this ?
    public SimpleList<T> getPlants() {
        //hack to get a copy of the current list
        return (plants.map(p -> p));
    }
}
