package ru.udemy.lesson15.homework.cosmicBody;

/**
 *
 * Общий абстрактный класс для двигающихся тел
 *
 *  @version   1.0 09 Oct 2013
 *  @author    Титков Егор
 */

public abstract class MovingCosmicBody extends CosmicBody{

    private double speed;

    public MovingCosmicBody(double mass, double diameter, String name, double x, double y, double speed) {
        super(mass, diameter, name, x, y);
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    /**
     * Расчёт пройденного пути за кол-во секунд
     */
    public double getDistanceTraveled(int seconds){
        return speed * seconds;
    }
}
