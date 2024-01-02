package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.constants.GameObjectTypeName;
import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.locations.Location;

import lombok.Getter;

@Getter
public class SimplePiece extends AbstractGameObject {
    private final GameObjectTypeName TYPE = GameObjectTypeName.PIECE;

    public SimplePiece(Location inLocation) {
        super(inLocation);
    }

    @Override
    public Prototype createClone() {
        this.setClone(new SimplePiece(this.getInLocation()));
        return super.createClone();
    }
}
