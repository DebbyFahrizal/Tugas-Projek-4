import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelComplete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelComplete extends Actor {
    public LevelComplete(int level) {
        setImage(new GreenfootImage("Level " + level + " Complete", 36, Color.WHITE, null));
    }

    public void act() {
        getWorld().removeObject(this);
    }
}
