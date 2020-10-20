package ru.isu.players;

import ru.isu.storages.CD;
import ru.isu.storages.MusicStorage;

/**
 * Модель СД - проигрывателя
 * @author Сергей
 */
public class CDPlayer extends SoundReproducingDevice{

    /**
     * Метод, выводящий название песни из носителя
     * @param storage - носитель музыки
     */
    @Override
    public void playMusic(MusicStorage storage) {
        if (storage.getClass().equals(CD.class)) {
            System.out.println("CD player plays " + storage.getSongName());
        } else System.out.println("CD player cannot play a song");
    }
}
