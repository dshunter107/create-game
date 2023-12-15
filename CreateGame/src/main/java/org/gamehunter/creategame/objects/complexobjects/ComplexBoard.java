package org.gamehunter.creategame.objects.complexobjects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.locations.GameLocation;

import lombok.Getter;

@Getter
public class ComplexBoard extends AbstractComplexGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.BOARD;

    public ComplexBoard(GameLocation inLocation) {
        super(inLocation);
    }

}
