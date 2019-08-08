
package ru.mrkors.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Music music = context.getBean("rapMusic", Music.class);
        MusicPlayer rapMusicPlayer = new MusicPlayer(music);
        rapMusicPlayer.playSong();
        
        Music music2 = context.getBean("rockMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(music2);
        rockMusicPlayer.playSong();
        
        Music music3 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music3);
        classicalMusicPlayer.playSong();
        
        context.close();
    }
}
