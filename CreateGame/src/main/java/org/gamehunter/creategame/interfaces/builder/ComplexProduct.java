package org.gamehunter.creategame.interfaces.builder;

import java.util.ArrayList;

public interface ComplexProduct {

    ArrayList<ComplexProductPart> getSections();

    ArrayList<ComplexProductPart> getConnections();

    void addComplexProductInfoToPart(ComplexProductPart part);

}
