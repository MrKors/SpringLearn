
package ru.mrkors.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        RapMusic rapMusic = context.getBean("musicBean", RapMusic.class);
        System.out.println(rapMusic.getSong());
        
        context.close();
    }
}
