package ru.mrkors.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dima
 */
@Component
public class MusicPlayer {
//    @Autowired
//    private Music music;
    
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    
//    private Music music;
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
                
    public String playSong(){
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: "+ rockMusic.getSong());
    }
 }
