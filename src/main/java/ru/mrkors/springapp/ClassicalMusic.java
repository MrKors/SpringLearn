package ru.mrkors.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dima
 */
@Component
public class ClassicalMusic implements Music{
    List <Enum> classicalMusicList = new ArrayList<>();
    {
        for(Enum s: ClassicalMusicList.values()){
            classicalMusicList.add(s);
        }
    }
       
    @Override
    public List<Enum> getSong() {
        return classicalMusicList;
    }
}
