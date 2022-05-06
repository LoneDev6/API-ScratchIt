package dev.lone.ScratchIt.api.events;

import dev.lone.ScratchIt.api.NotActuallyScratchItException;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when the player has finished scratching a card.
 */
public class ScratchCardFinishEvent extends AbstractCancellableScratchItEvent
{
    public ScratchCardFinishEvent(Player player, ItemStack scratchCard, String id, boolean won)
    {
        super(player, scratchCard, id, true);
        throw new NotActuallyScratchItException();
    }

    /**
     * Get the scratch card result: WIN or LOSE.
     *
     * @return returns WIN or LOSE.
     */
    public Status getStatus()
    {
        throw new NotActuallyScratchItException();
    }

    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyScratchItException();
    }

    public static HandlerList getHandlerList()
    {
        throw new NotActuallyScratchItException();
    }

    public enum Status
    {
        WIN,
        LOSE
    }
}
