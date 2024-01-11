package org.gamehunter.creategame.commands.location_commands;

import org.gamehunter.creategame.interfaces.command.Command;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.locations.LocationUser;

public interface LocationCommand extends Command {
    @Override
    LocationCommand execute();

    @Override
    LocationCommand undo();

    LocationCommand setLocationFrom(Location locationFrom);

    LocationCommand setLocationTo(Location locationTo);

    LocationCommand setGameObject(LocationUser gameObject);
}
