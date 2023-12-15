package org.gamehunter.creategame.builder;

import org.gamehunter.creategame.interfaces.builder.Director;
import org.gamehunter.creategame.locations.GameLocation;

public class ComplexBoardDirector extends AbstractDirector {

    public ComplexBoardDirector() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Director createBuilder(GameLocation inLocation) {
        this.builder = new ComplexBoardBuilder(inLocation);
        return this;
    }
}
