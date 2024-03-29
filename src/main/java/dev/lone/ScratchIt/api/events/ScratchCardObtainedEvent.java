package dev.lone.ScratchIt.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when a player obtains a scratch card by `/scratchit get` or `/scratchit give` commands
 */
public class ScratchCardObtainedEvent extends AbstractCancellableScratchItEvent
{
    private static final HandlerList HANDLERS = new HandlerList();

    public ScratchCardObtainedEvent(Player player, ItemStack scratchCard, String id)
    {
        super(player, scratchCard, id);
    }

    @NotNull
    public HandlerList getHandlers()
    {
        return HANDLERS;
    }

    public static HandlerList getHandlerList()
    {
        return HANDLERS;
    }
}
