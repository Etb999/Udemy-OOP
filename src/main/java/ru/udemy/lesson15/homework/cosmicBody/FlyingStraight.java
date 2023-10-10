package ru.udemy.lesson15.homework.cosmicBody;

/**
 *
 * Интерфейс космических тел двигающихся по прямой
 *
 *  @version   1.0 09 Oct 2013
 *  @author    Титков Егор
 */

public interface FlyingStraight {

    /**
     * Проверка столкновения с космическим телом
     */
    boolean canCollide(CosmicBody cosmicBody);


    /**
     * Проверка находится ли космичексое тело в движении
     */
    boolean isMoving();
}
