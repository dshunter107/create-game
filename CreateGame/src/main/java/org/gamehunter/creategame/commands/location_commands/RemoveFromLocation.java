package org.gamehunter.creategame.commands.location_commands;

public class RemoveFromLocation extends AbstractLocationCommand {

    @Override
    public LocationCommand execute() {
        this.gameObject.unregisterObserver(this.locationFrom);
        return this;
    }

    @Override
    public LocationCommand undo() {
        this.gameObject.registerObserver(this.locationFrom);
        return this;
    }

}
