package org.gamehunter.creategame.objects.complexobjects;

import org.gamehunter.creategame.interfaces.prototype.ComplexPrototype;
import org.gamehunter.creategame.locations.Location;

public class ComplexPiece extends AbstractComplexGameObject {

    public ComplexPiece(Location inLocation) {
        super(inLocation);
    }

    @Override
    public ComplexPrototype createClone() {
        this.setClone(new ComplexBoard(this.getInLocation()));
        return super.createClone();
    }
}
