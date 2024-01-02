package org.gamehunter.creategame.builder;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.complexobjects.ComplexBoard;

public class ComplexBoardBuilder extends AbstractBuilder {

    public ComplexBoardBuilder(Location inLocation) {
        super(inLocation);
    }

    @Override
    protected ComplexProduct instantiateProduct(Location inLocation) {
        return new ComplexBoard(inLocation);
    }
}
