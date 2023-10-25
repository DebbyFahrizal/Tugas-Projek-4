import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor {
    private int moveDistance = 1;
    private int moveDirection = 1;

    public Enemy() {
        setImage("Penjaga/Ikon1.png");
    }

    public void act() {
        moveHorizontally();
        checkEdge();
    }

    public void moveHorizontally() {
        setLocation(getX() + (moveDirection * moveDistance), getY());
    }

    public void checkEdge() {
        if (isAtEdge()) {
            moveDirection *= -1;
        }
    }
}
