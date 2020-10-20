package ru.isu.players;

import ru.isu.storages.MusicStorage;

/**
 * Модель универсального проигрывателя
 * @author Сергей
 */
public class UniversalPlayer extends SoundReproducingDevice{

    /**
     * Метод, выводящий название песни из носителя
     * @param storage - носитель музыки
     */
    @Override
    public void playMusic(MusicStorage storage) {
        System.out.println("Universal player plays " + storage.getSongName());
    }
}
