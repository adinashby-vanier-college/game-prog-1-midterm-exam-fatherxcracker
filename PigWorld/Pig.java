// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * This demonstrates how the user will be able to control the pig using various keys for its directions.
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
    }

    /**
     * When the pig intersects a burger, it will eat it playing a sound.
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * This demonstrates how if the pig is manages to eat all the burgers or not, the user will win.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * If the user wins it will transition to a winning world/screen (GameWonWorld)
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
