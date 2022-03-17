package dev.lone.ScratchIt.api.events;

import dev.lone.ScratchIt.api.NotActuallyScratchItException;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ScratchCardObtainedEvent extends AbstractScratchItEvent
{
    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyScratchItException();
    }
}
