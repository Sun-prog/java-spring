import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        ClassicalMusic classicalMusic2 = context.getBean("musicBeanClassic", ClassicalMusic.class);

        System.out.println(classicalMusic2.getSong());

        /*MusicPlayer musicPlayer = context.getBean("playerBean", MusicPlayer.class);

        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        MusicPlayer firstMusicPlayer = context.getBean("playerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("playerBean", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/
        context.close();
    }
}
