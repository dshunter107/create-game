package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.locations.GameLocation;

import lombok.Getter;

@Getter
public class SimpleBoard extends AbstractGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.BOARD;

    public SimpleBoard(GameLocation inLocation) {
        super(inLocation);
    }
}
