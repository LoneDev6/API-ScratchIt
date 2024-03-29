package dev.lone.ScratchIt.api.events;

import dev.lone.ScratchIt.api.NotActuallyScratchItException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when the scratch cards are loaded
 */
public class ScratchItCardsLoaded extends Event
{
    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        throw new NotActuallyScratchItException();
    }
}
