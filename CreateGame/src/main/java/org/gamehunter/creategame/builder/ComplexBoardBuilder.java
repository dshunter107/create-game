package org.gamehunter.creategame.builder;

import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.complexobjects.ComplexBoard;

public class ComplexBoardBuilder extends AbstractBuilder {

    public ComplexBoardBuilder(GameLocation inLocation) {
        super(inLocation);
    }

    @Override
    protected ComplexProduct instantiateProduct(GameLocation inLocation) {
        return new ComplexBoard(inLocation);
    }
}
