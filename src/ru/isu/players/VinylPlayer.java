package ru.isu.players;

import ru.isu.storages.MusicStorage;
import ru.isu.storages.VinylRecord;

/**
 * Модель винилового проигрывателя
 * @author Сергей
 */
public class VinylPlayer extends SoundReproducingDevice{

    /**
     * Метод, выводящий название песни из носителя
     * @param storage - носитель музыки
     */
    @Override
    public void playMusic(MusicStorage storage) {
        if (storage.getClass().equals(VinylRecord.class)) {
            System.out.println("Vinyl player plays " + storage.getSongName());
        } else System.out.println("Vinyl player cannot play a song");
    }
}
