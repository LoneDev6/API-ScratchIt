package dev.lone.ScratchIt.api;

import org.bukkit.plugin.Plugin;

/**
 * The {@link NotActuallyScratchItException} is thrown whenever someone seems to
 * invoke an API method without actually having ScratchIt installed.
 * <p>
 * Remember, this is just a "mock", not the actual ScratchIt project.
 *
 * @author TheBusyBiscuit
 */
public class NotActuallyScratchItException extends UnsupportedOperationException
{
    /**
     * Our generated serial version UID (For serialization).
     */
    private static final long serialVersionUID = 1053110941962226146L;

    /**
     * This creates a new {@link NotActuallyScratchItException}.
     * Use the actual {@link Plugin} to test your features, not this.
     */
    public NotActuallyScratchItException()
    {
        super("Error: ScratchIt does not seem to be installed. This is just the API reference, not the actual implementation.");
    }
}
