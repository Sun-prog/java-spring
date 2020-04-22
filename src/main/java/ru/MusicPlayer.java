package ru;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(){}
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void getSong(){
       System.out.println("playing"+ music.getSong());
     }

     public void playMusicList(){

         for (Music item : musicList) {
             System.out.println(item.getSong());
         }
     }

}
