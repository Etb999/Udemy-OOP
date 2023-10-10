package ru.udemy.lesson15.homework.cosmicBody;

/**
 *
 * Класс описывающий планету
 *
 * @version   1.0 09 Oct 2013
 * @author    Титков Егор
 */

public class Planet extends MovingCosmicBody {

    private double distanceToStar;

    public Planet(double mass, double diameter, String name, double x, double y, double speed, double distanceToStar) {
        super(mass, diameter, name, speed, x, y);
        this.distanceToStar = distanceToStar;
    }

    @Override
    public String toString() {
        return "Planet - " +
                "[ name = " + getName() +
                " mass = " + getMass() +
                ", diameter = " + getDiameter() +
                " ]";
    }
}
