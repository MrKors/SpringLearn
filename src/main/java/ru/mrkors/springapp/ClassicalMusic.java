package ru.mrkors.springapp;

import org.springframework.stereotype.Component;

/**
 *
 * @author Dima
 */
@Component
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
    
    
}
