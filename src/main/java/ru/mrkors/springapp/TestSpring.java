
package ru.mrkors.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicplayer = new MusicPlayer(music);
        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        
        boolean comparison = firstmusicPlayer == secondmusicPlayer;
        System.err.println(comparison);
        
        firstmusicPlayer.setVolume(10);
        
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());
//        musicPlayer.playSong();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        
        context.close();
    }
}
