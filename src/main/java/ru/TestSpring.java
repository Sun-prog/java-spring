package ru;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       Music music = context.getBean("rockMusic", ru.Music.class);

    MusicPlayer musicPlayer = new ru.MusicPlayer(music);

      musicPlayer.getSong();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.getSong();
        context.close();
    }
}
