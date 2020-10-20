package ru.isu.storages;

/**
 * Наследумый класс для носителей музыки
 * @author Сергей
 */
public abstract class MusicStorage {
    /**
     * @param songName - название песни
     */
    private String songName;

    /**
     * Конструктор
     * @param songName
     */
    public MusicStorage(String songName) {
        this.songName = songName;
    }


    /**
     *
     * @return Название песни
     */
    public String getSongName() {
        return songName;
    }

    /**
     * Установка названия новой песни
     * @param songName - название песни
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }
}
