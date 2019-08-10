package ru.mrkors.springapp;

import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dima
 */
@Component
public class RockMusic implements Music{

    @Override
    public List<Enum> getSong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
