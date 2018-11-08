package de.thro.inf.prg3.a05.model;

public class Shrub extends Plant
{
    private final PlantColor color = PlantColor.GREEN;

    public Shrub(double height, String family, String name)
    {
        super(height, family, name);
    }

    @Override
    public PlantColor getColor() {
        return color;
    }
}
