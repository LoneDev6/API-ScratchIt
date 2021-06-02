package dev.lone.ScratchIt.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public class ScratchIt
{   
    /**
     * Show a card to a player by its id.
     * @param player
     * @param cardId Id of the card, found in your config file
     * @param allowCancel Allow the player to cancel the usage using defined methods in config.yml of this plugin.
     * @throws IllegalAccessException if plugin is still loading
     * @throws NullPointerException if card doesn't exist
     */
    public static void showCard(Player player, String cardId, boolean allowCancel) throws IllegalAccessException, NullPointerException
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Cancel scratching of a card.
     * @param player
     * @param givePrize Decide if you want to give prizes to the player if they revealed most part of the card contents.
     */
    public static void cancelCardUsage(Player player, boolean givePrize)
    {
        throw new NotActuallyScratchItException();
    }

    /**
     * Get the current card for this player.
     * @param player
     * @return null if player is not scratching a card
     */
    @Nullable
    public static String getCurrentCard(Player player)
    {
        throw new NotActuallyScratchItException();
    }
}
