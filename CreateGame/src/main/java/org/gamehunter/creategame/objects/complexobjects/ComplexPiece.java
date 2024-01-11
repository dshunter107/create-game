package org.gamehunter.creategame.objects.complexobjects;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.locations.Location;

public class ComplexPiece extends AbstractComplexGameObject {

    public ComplexPiece(Location inLocation) {
        super(inLocation);
    }

    @Override
    public ComplexProduct createClone() {
        this.setClone(new ComplexBoard(this.getInLocation()));
        return super.createClone();
    }
}
