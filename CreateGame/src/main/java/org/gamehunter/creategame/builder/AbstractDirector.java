package org.gamehunter.creategame.builder;

import java.util.ArrayList;
import java.util.HashMap;

import org.gamehunter.creategame.interfaces.builder.Builder;
import org.gamehunter.creategame.interfaces.builder.ComplexProduct;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.interfaces.builder.Director;
import org.gamehunter.creategame.locations.GameLocation;

public abstract class AbstractDirector implements Director {
    public Builder builder;

    public AbstractDirector() {
    }

    @Override
    public abstract Director createBuilder(GameLocation inLocation);

    @Override
    public ComplexProduct getProduct() {
        return this.builder.getComplexProduct();
    }

    @Override
    public Director buildProduct() {
        this.builder.buildParts();
        return this;
    }

    @Override
    public Director setAllPotentialParts(HashMap<String, ArrayList<ComplexProductPart>> parts) {
        this.builder.setAllPotentialParts(parts);
        return this;
    }
}
