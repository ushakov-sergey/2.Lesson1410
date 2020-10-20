package ru.isu.players;

import ru.isu.storages.MusicStorage;

/**
 * Наследуемый класс для проигрывателей
 * @author Сергей
 */
public abstract class SoundReproducingDevice {

    /**
     * Метод, выводящий название песни из носителя
     * @param storage - носитель музыки
     */
    public abstract void playMusic(MusicStorage storage);
}
