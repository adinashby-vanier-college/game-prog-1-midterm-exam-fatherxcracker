// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Shows message that displays when user loses the game and plays losing sound.
     */
    public GameOverWorld()
    {
        super(560, 560, 1);
        showTextWithBigWhiteFont("SORRY YOU LOSE!!!", 40, 200);
        Greenfoot.playSound("lose.wav");
    }

    /**
     * Sets the font, color and other details of the winning message.
     */
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
