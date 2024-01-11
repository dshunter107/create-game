package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;

@Getter
public class SimpleBoard extends AbstractGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.BOARD;

    public SimpleBoard(Location inLocation) {
        super(inLocation);
    }

    @Override
    public SimpleBoard createClone() {
        SimpleBoard cloneBoard = new SimpleBoard(this.getInLocation());
        this.setClone(cloneBoard);
        super.createClone();
        return cloneBoard;
    }
}
