package ru.udemy.lesson15.homework.cosmicBody;

/**
 *
 * Класс описывающий астероид
 *
 * @version   1.0 09 Oct 2013
 * @author    Титков Егор
 */

public class Asteroid extends MovingCosmicBody implements FlyingStraight{

    private double destinationX = 0;
    private double destinationY = 0;

    public Asteroid(double mass, double diameter, String name, double x, double y, double speed, double destinationX, double destinationY) {
        super(mass, diameter, name, x, y, speed);
        setFlyingDest(destinationX, destinationY);
    }

    /**
     * Задане напраления движения астероида
     */
    public void setFlyingDest(double x, Double y){
        this.destinationX = x;
        this.destinationY = y;
    }

    @Override
    public double getDistanceTraveled(int seconds) {
        return getSpeed() * seconds;
    }

    @Override
    public boolean canCollide(CosmicBody cosmicBody) {

        return false;
    }

    @Override
    public boolean isMoving() {
        return (destinationX != 0 && destinationY != 0);
    }
}
