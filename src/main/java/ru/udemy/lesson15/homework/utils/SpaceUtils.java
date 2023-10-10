package ru.udemy.lesson15.homework.utils;

import ru.udemy.lesson15.homework.cosmicBody.CosmicBody;
import ru.udemy.lesson15.homework.cosmicBody.Star;

/**
 * Утилитарный класс для расчёта силы гравитации между космическими телами
 * и определения является ли тело звездой
 *
 *  @version   1.0 09 Oct 2013
 *  @author    Титков Егор
 */

public final class SpaceUtils {

    private static final float GRAVITY_FORCE_KOEF = 6.674f;

    private SpaceUtils(){};

    /**
     * Расчёт силы гравитационного притяжения между двумя космическими телами
     */
    public static double getGravityForce(CosmicBody cosmicBody1, CosmicBody cosmicBody2){
        double gravityForce;

        gravityForce = (GRAVITY_FORCE_KOEF * cosmicBody1.getMass() * cosmicBody2.getMass())
                / cosmicBody1.getDistance(cosmicBody2);

        return gravityForce;
    }

    /**
     * Проверка является ли космическое тело звездой
     */
    public static boolean isStar(CosmicBody cosmicBody){
        return (cosmicBody instanceof Star);
    }
}
