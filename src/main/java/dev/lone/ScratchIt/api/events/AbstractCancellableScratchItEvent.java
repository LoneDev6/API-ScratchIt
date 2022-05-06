package dev.lone.ScratchIt.api.events;

import dev.lone.ScratchIt.api.NotActuallyScratchItException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.ItemStack;

public abstract class AbstractCancellableScratchItEvent extends AbstractScratchItEvent implements Cancellable
{
    AbstractCancellableScratchItEvent(Player player, ItemStack scratchCard, String id)
    {
        super(player, scratchCard, id);
    }

    AbstractCancellableScratchItEvent(Player player, ItemStack scratchCard, String id, boolean async)
    {
        super(player, scratchCard, id, async);
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
