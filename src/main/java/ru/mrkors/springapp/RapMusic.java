package ru.mrkors.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dima
 */
@Component
public class RapMusic implements Music{
List <Enum> rapMusicList = new ArrayList<>();
    {
        for(Enum s: RapMusicList.values()){
            rapMusicList.add(s);
        }
    }

    @Override
    public List<Enum> getSong() {
        return rapMusicList;
    }
}
