package org.gamehunter.creategame.objects.complexobjects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;

@Getter
public class ComplexBoard extends AbstractComplexGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.BOARD;

    public ComplexBoard(Location inLocation) {
        super(inLocation);
    }

    @Override
    public ComplexBoard createClone() {
        ComplexBoard boardClone = new ComplexBoard(this.getInLocation());
        this.setComplexClone(boardClone);
        super.createClone();
        return boardClone;
    }

}
