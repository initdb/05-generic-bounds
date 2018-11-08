package de.thro.inf.prg3.a05.model;

public class Shrub<T> extends Plant<T>
{
    @Override
    public PlantColor getColor() {
        return null;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
