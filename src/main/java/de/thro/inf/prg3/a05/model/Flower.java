package de.thro.inf.prg3.a05.model;

public class Flower extends Plant
{
    private PlantColor color;

    public Flower(double height, String family, String name, PlantColor color)
    {
        super(height, family, name);

        if(color == PlantColor.GREEN)
            throw new IllegalArgumentException("Flower shall not be green!");
        else
            this.color = color;
    }

    @Override
    public PlantColor getColor()
    {
        return color;
    }
}
