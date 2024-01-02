package org.gamehunter.creategame.interfaces.builder;

import java.util.ArrayList;
import java.util.HashMap;

import org.gamehunter.creategame.locations.Location;

public interface Director {
    Director createBuilder(Location location);

    Director setAllPotentialParts(HashMap<String, ArrayList<ComplexProductPart>> parts);

    Director buildProduct();

    ComplexProduct getProduct();

}
