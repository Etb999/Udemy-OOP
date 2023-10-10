package ru.udemy.lesson15.homework.cosmicBody;

import java.util.Arrays;

/**
 *
 * Класс описывающий зведзу
 *
 *  @version   1.0 09 Oct 2013
 *  @author    Титков Егор
 */

public class Star extends CosmicBody{

    Planet planets[];

    public Star(float mass, float diameter, String name, double x, double y, Planet... planets) {
        super(mass, diameter, name, x, y);
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "Star - " + getName() +
                "[ mass = " + getMass() +
                ", diameter = " + getDiameter() +
                ", planets = " + Arrays.toString(planets) +
                " ]";
    }
}
