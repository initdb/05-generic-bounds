package de.thro.inf.prg3.a05.model;

public abstract class Plant<T> implements Comparable<T>
{
    private double height;
    private String family;
    private String name;

    private Plant() {}

    protected Plant(double height, String family, String name)
    {
        if(height <= 0 || family == null || family.length() <= 0 || name == null || name.length() <= 0)
            throw new IllegalArgumentException("Insufficient Plant() parameter!");

        this.height = height;
        this.family = family;
        this.name = name;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

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
