package org.gamehunter.creategame.action.transaction;

import org.gamehunter.creategame.exceptions.NoLocationRuntimeException;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.AbstractGameObject;

import lombok.Getter;

@Getter
public class GameObjectMoves implements Transaction {
    private AbstractGameObject item;
    private Location oldLocation;
    private Location newLocation;

    public GameObjectMoves(AbstractGameObject item, Location newLocation) {
        this.item = item;
        this.oldLocation = item.getInLocation();
        this.newLocation = newLocation;
    }


    @Override
    public void execute() {
        if (!this.preExecutionChecks()) {
            throw new NoLocationRuntimeException("Cannot Execute because a missing location");
        }
        this.item.setInLocation(this.newLocation);
    }

    private boolean preExecutionChecks() {
        return this.oldLocation != null && this.newLocation != null;
    }

}
