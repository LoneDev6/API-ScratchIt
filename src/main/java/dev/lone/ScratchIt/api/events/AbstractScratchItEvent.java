package dev.lone.ScratchIt.api.events;

import dev.lone.ScratchIt.api.NotActuallyScratchItException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

public abstract class AbstractScratchItEvent extends Event implements Cancellable
{
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

    @Override
    public void setCancelled(boolean cancelled)
    {
        throw new NotActuallyScratchItException();
    }

    @Override
    public boolean isCancelled()
    {
        throw new NotActuallyScratchItException();
    }
}
