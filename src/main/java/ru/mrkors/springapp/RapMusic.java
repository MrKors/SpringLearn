package ru.mrkors.springapp;

/**
 *
 * @author Dima
 */
public class RapMusic implements Music{

    private RapMusic() {
    }
    
    public static RapMusic setRapMusic(){
        return new RapMusic();
    }
    
    public void InitMethod(){
        System.out.println("Initialization...");
    }
    public void DestroyMethod(){
        System.out.println("Destruction.");
    }
    

    @Override
    public String getSong() {
        return "Pizza";
    }
    
}
