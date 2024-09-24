// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * When the snake is instantiated, it will be facing a random direction.
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        
        if (isGameOver()) {
            transitionToGameIsOver();
        }
    }

    /**
     * This method describes random movement of the enemy (Snake).
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * When the Snake intersects the Pig it eats it, playing a losing sound.
     */
    public void eat()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * This demonstrates how if the pig is eaten or not will determine if the user loses the game.
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method transititions to the losing screen (GameOverWorld).
     */
    public void transitionToGameIsOver()
    {
        World gameIsOver =  new GameOverWorld();
        Greenfoot.setWorld(gameIsOver);
    }
}
