package org.gamehunter.creategame.interfaces.builder;

import java.util.ArrayList;
import java.util.HashMap;

public interface Builder {

    void setAllPotentialParts(HashMap<String, ArrayList<ComplexProductPart>> potentialParts);

    Builder buildParts();

    void buildPart(ComplexProductPart part);

    ComplexProduct getComplexProduct();
}
