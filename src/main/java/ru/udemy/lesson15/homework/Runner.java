package ru.udemy.lesson15.homework;

import ru.udemy.lesson15.homework.cosmicBody.Asteroid;
import ru.udemy.lesson15.homework.cosmicBody.CosmicBody;
import ru.udemy.lesson15.homework.cosmicBody.Planet;
import ru.udemy.lesson15.homework.cosmicBody.Star;

public class Runner {

    public static void main(String[] args) {

        Planet earth = new Planet(123, 245, "Earth", 20, 23, 20, 40);
        Planet saturn = new Planet(123, 245, "Saturn", 10, 13, 20, 80);

        CosmicBody sun = new Star(5555, 5235235, "Sun", 0, 0, earth, saturn);

        CosmicBody xyz = new Asteroid(35,10, "xyz", 80, 80, 30, -10, -10);

        System.out.println(sun);

        System.out.println(earth.getDistance(saturn));

    }
}
