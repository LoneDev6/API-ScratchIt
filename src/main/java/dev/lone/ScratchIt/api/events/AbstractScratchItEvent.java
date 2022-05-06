package dev.lone.ScratchIt.api.events;

import dev.lone.ScratchIt.api.NotActuallyScratchItException;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

public abstract class AbstractScratchItEvent extends Event
{
    AbstractScratchItEvent(Player player, ItemStack scratchCard, String id)
    {
        this(player, scratchCard, id, false);
    }

    AbstractScratchItEvent(Player player, ItemStack scratchCard, String id, boolean async)
    {
        super(async);
        throw new NotActuallyScratchItException();
    }

    public Player getPlayer()
    {
        throw new NotActuallyScratchItException();
    }

    public ItemStack getScratchCard()
    {
        throw new NotActuallyScratchItException();
    }

    public String getId()
    {
        throw new NotActuallyScratchItException();
    }
}
