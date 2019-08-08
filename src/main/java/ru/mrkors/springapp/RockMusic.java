package ru.mrkors.springapp;

import org.springframework.stereotype.Component;

/**
 *
 * @author Dima
 */
@Component
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
    
    
}
