package ru.mrkors.springapp;

import java.util.Random;
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
//    private RockMusic rockMusic;
    
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
    }
    
//    private Music music;
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
                
    public String playSong(MusicGenre genre){
      
        Random random = new Random();
        int rndNumber = random.nextInt(ClassicalMusicList.values().length);
        if(genre == MusicGenre.CLASSICAL){
        return "Playing: " + classicalMusic.getSong().get(rndNumber);
//        System.out.println("Playing: "+ rockMusic.getSong());
    }
        else return "fail";
    }
 }
