import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor {
    private GreenfootImage characterImage;
    private int speed = 5;
    private int lives = 3;

    public Character() {
        characterImage = new GreenfootImage("Rimba/Ikon1.png");
        setImage(characterImage);
    }

    public void act() {
        move(0);
        checkForCollision();

        if(Greenfoot.isKeyDown("up")){
             this.setLocation(this.getX(), this.getY()-speed);
        }
        
        if(Greenfoot.isKeyDown("down")){
             this.setLocation(this.getX(), this.getY()+speed);
        }
        
        if(Greenfoot.isKeyDown("left")){
             this.setLocation(this.getX()-speed, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
             this.setLocation(this.getX()+speed, this.getY());
        }
    }
    

    public void checkForCollision() {
        Actor object = getOneIntersectingObject(ObjectSpecial.class);
        if (object != null) {
            increaseScore();
            getWorld().removeObject(object);
        }

        Actor enemy = getOneIntersectingObject(Enemy.class);
        if (enemy != null) {
            takeDamage();
        }
    }

    public void increaseScore() {
        ((MyWorld) getWorld()).increaseScore();
    }

    public void takeDamage() {
        lives--;
        if (lives <= 0) {
            World world = getWorld();
            if (world != null) {
                world.showText("Game Over - You Lose!", world.getWidth() / 2, world.getHeight() / 2);
                Greenfoot.stop();
            }
        }
    }
}
