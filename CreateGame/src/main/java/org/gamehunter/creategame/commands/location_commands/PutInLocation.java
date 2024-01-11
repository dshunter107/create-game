package org.gamehunter.creategame.commands.location_commands;

public class PutInLocation extends AbstractLocationCommand {

    @Override
    public LocationCommand execute() {
        this.gameObject.setInLocation(this.locationTo);
        return this;
    }

    @Override
    public LocationCommand undo() {
        this.gameObject.setInLocation(this.locationFrom);
        return this;
    }

}
