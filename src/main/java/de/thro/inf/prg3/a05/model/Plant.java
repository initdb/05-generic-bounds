package de.thro.inf.prg3.a05.model;

public abstract class Plant<T> implements Comparable<T>
{
    private double height;
    private String family;
    private String name;
    private PlantColor color;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();
}
