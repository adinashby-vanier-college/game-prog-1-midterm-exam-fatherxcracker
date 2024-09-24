// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig =  new Pig();
        addObject(pig, 311, 185);
        Snake snake =  new Snake();
        addObject(snake, 563, 366);
        Burger burger =  new Burger();
        addObject(burger, 79, 84);
        Burger burger2 =  new Burger();
        addObject(burger2, 499, 84);
        Burger burger3 =  new Burger();
        addObject(burger3, 154, 285);
        Burger burger4 =  new Burger();
        addObject(burger4, 445, 291);
        Burger burger5 =  new Burger();
        addObject(burger5, 279, 58);
        Burger burger6 =  new Burger();
        addObject(burger6, 266, 354);
    }
}
