package org.gamehunter.creategame.interfaces.builder;

import java.util.ArrayList;
import java.util.HashMap;

import org.gamehunter.creategame.locations.GameLocation;

public interface Director {
    Director createBuilder(GameLocation inLocation);

    Director setAllPotentialParts(HashMap<String, ArrayList<ComplexProductPart>> parts);

    Director buildProduct();

    ComplexProduct getProduct();

}
