package ru.isu;

import ru.isu.players.CDPlayer;
import ru.isu.players.SoundReproducingDevice;
import ru.isu.players.UniversalPlayer;
import ru.isu.players.VinylPlayer;
import ru.isu.storages.CD;
import ru.isu.storages.FlashDrive;
import ru.isu.storages.MusicStorage;
import ru.isu.storages.VinylRecord;

public class Main {

    public static void main(String[] args) {
        /**
         * Создание экземпляров носителей
         */
	    MusicStorage flash = new FlashDrive("Queen – Bohemian Rhapsody");
        MusicStorage cd = new CD("Rick Astley - Never Gonna Give You Up");
        MusicStorage vinylRecord = new VinylRecord("Bach's Lost Symphony");

        /**
         * Создание экземпляров проигрывателей
         */
        SoundReproducingDevice vinylPlayer = new VinylPlayer();
        SoundReproducingDevice cdPlayer = new CDPlayer();
        SoundReproducingDevice universalPlayer = new UniversalPlayer();

        /**
         * Виниловый проигрыватель
         */
        vinylPlayer.playMusic(flash);
        vinylPlayer.playMusic(cd);
        vinylPlayer.playMusic(vinylRecord);

        /**
         * СД - проигрыватель
         */
        cdPlayer.playMusic(flash);
        cdPlayer.playMusic(cd);
        cdPlayer.playMusic(vinylRecord);

        /**
         * Универсальный проигрыватель
         */
        universalPlayer.playMusic(flash);
        universalPlayer.playMusic(cd);
        universalPlayer.playMusic(vinylRecord);

    }
}
