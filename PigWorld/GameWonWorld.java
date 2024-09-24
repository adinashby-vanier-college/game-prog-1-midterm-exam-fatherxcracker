// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Shows message that displays when user wins the game and plays winning sound.
     */
    public GameWonWorld()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("CONGRATS YOU WIN!!!", 10, 200);
        Greenfoot.playSound("win.wav");
    }

    /**
     * Sets the font, color and other details of the winning message.
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
