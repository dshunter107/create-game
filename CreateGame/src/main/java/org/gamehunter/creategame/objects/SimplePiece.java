package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;

@Getter
public class SimplePiece extends AbstractGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.PIECE;

    public SimplePiece(Location inLocation) {
        super(inLocation);
    }

    @Override
    public SimplePiece createClone() {
        SimplePiece clonePiece = new SimplePiece(this.getInLocation());
        this.setClone(clonePiece);
        super.createClone();
        return clonePiece;
    }
}
