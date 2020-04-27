package ru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;



public class MusicPlayer {

    private Music music1;
    private Music music2;
    List<String> playList;
    List<Music> musicGenre;

    public MusicPlayer(List<Music> musicGenre) {
        this.musicGenre = musicGenre;
    }

    enum Type { CLASSIC, ROCK }
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        Random random = new Random();
        playList = musicGenre.get(random.nextInt(musicGenre.size())).getSong();

        return "Playing: " + playList.get(random.nextInt(playList.size()));
    }

}
