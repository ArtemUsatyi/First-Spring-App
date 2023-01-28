package ru.springProject;

import java.util.List;

public class MusicPlayer {
    private List<Music> listMusic;
    private int randomInt;

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public void playMusic() {
        randomInt = (int) (Math.random() * 3);
        System.out.println("Играет музыка: " + listMusic.get(randomInt).getSong());
    }
}
