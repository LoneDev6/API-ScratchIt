package dev.lone.ScratchIt.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ScratchCardUseEvent extends AbstractCancellableScratchItEvent
{
    private static final HandlerList HANDLERS = new HandlerList();

    public ScratchCardUseEvent(Player player, ItemStack scratchCard, String id)
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
