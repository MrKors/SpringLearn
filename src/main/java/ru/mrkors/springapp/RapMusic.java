package ru.mrkors.springapp;

import org.springframework.stereotype.Component;

/**
 *
 * @author Dima
 */
//@Component
public class RapMusic implements Music{

    @Override
    public String getSong() {
        return "Pizza";
    }
    
}
