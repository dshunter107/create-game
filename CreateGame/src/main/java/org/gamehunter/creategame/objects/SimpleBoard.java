package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;

@Getter
public class SimpleBoard extends AbstractGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.BOARD;

    public SimpleBoard(Location inLocation) {
        super(inLocation);
    }

    @Override
    public Prototype createClone() {
        this.setClone(new SimpleBoard(this.getInLocation()));
        return super.createClone();
    }
}
