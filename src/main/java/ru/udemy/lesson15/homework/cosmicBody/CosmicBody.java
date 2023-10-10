package ru.udemy.lesson15.homework.cosmicBody;

/**
 *
 * Общий абстрактный класс для всех космичесикх тел
 *
 *  @version   1.0 09 Oct 2013
 *  @author    Титков Егор
 */

public abstract class CosmicBody {

    private double mass;
    private double diameter;
    private String name;

    private double x;
    private double y;

    public CosmicBody(double mass, double diameter, String name, double x, double y) {
        this.mass = mass;
        this.diameter = diameter;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     * Расчёт расстояния между двумя космическими телами
     */
    public double getDistance(CosmicBody cosmicBody){
        double distance;

        distance = Math.sqrt(Math.pow(cosmicBody.x - this.x, 2) +
                (Math.pow(cosmicBody.y - this.y, 2)));
        return distance;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getMass() {
        return mass;
    }

    public String getName(){
        return name;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

}
