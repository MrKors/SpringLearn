
package ru.mrkors.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playSong(MusicGenre.CLASSICAL));
        
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        
        context.close();
    }
}
