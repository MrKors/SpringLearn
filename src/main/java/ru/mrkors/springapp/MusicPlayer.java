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
    private RockMusic rockMusic;
    private RapMusic rapMusic;
    
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
    }
    
//    private Music music;
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
                
    public String playSong(MusicGenre musicGenre){
        Random random = new Random();
        int rndSong;
        
        if(musicGenre == MusicGenre.CLASSICAL){
            rndSong = random.nextInt(ClassicalMusicList.values().length);   
        return "Playing: " + classicalMusic.getSong().get(rndSong);
        }
        else if(musicGenre == MusicGenre.RAP){
            rndSong = random.nextInt(RapMusicList.values().length);
            return "Playing: " + rapMusic.getSong().get(rndSong);
        }    
        else return "fail"; 
        
 }
}
