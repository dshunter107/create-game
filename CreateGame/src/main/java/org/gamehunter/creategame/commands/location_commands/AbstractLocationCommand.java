package org.gamehunter.creategame.commands.location_commands;

import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.locations.LocationUser;

import lombok.Getter;

@Getter
public abstract class AbstractLocationCommand implements LocationCommand {
    protected LocationUser gameObject;
    protected Location locationFrom;
    protected Location locationTo;

    @Override
    public LocationCommand setLocationFrom(Location locationFrom) {
        this.locationFrom = locationFrom;
        return this;
    }

    @Override
    public LocationCommand setLocationTo(Location locationTo) {
        this.locationTo = locationTo;
        return this;
    }

    @Override
    public LocationCommand setGameObject(LocationUser object) {
        this.gameObject = object;
        return this;
    }

}
