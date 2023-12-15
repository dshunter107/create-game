package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.locations.GameLocation;

import lombok.Getter;

@Getter
public class SimplePiece extends AbstractGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.PIECE;

    public SimplePiece(GameLocation inLocation) {
        super(inLocation);
    }
}
