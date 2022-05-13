package dev.lone.ScratchIt.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

/**
 * This is an "advanced" class if you want to show something custom to your players, for example an animation
 * or an image / logo / menu.
 * Keep in mind that you have to handle all the stuff manually and this is limited compared to Spigot API.
 * The only advantage of using this is that it's not laggy like Spigot API as this is only packet based.
 *
 * Use this class only if you really need to.
 */
public class CustomCardRenderer
{
    /**
     * Create a new renderer for the player
     * @param player
     * @param freezePlayer if you want to make the player stand still.
     */
    public CustomCardRenderer(Player player, boolean freezePlayer)
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Set the item in hand info (optional)
     * @param displayName
     * @param lore
     */
    public void setItemInfo(String displayName, @Nullable List<String> lore)
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Sets a pixel on the map (doesn't support transparency for now)
     * @param x
     * @param y
     * @param color
     */
    public void setPixel(int x, int y, Color color)
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Sets a pixel on the map (doesn't support transparency for now)
     * @param x
     * @param y
     * @param rgb
     */
    public void setPixel(int x, int y, byte rgb)
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Sets a pixel on the map (doesn't support transparency for now)
     * @param x
     * @param y
     * @param rgb
     */
    public byte setPixel(int x, int y, int rgb)
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Sets a pixel on the map (doesn't support transparency for now)
     * @param rgb
     */
    public void setPixels(int[] rgb)
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Start the rendering of this card to the player.
     */
    public void start()
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Stop the rendering of this card and remove listeners.
     */
    public void stop()
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Stop the rendering of this card and remove listeners.
     * @param mainThead if you want to make it run on the main Bukkit thread if you're calling this from another.
     */
    public void stop(boolean mainThead)
    {
        throw new NotActuallyScratchItException();
    }
}
