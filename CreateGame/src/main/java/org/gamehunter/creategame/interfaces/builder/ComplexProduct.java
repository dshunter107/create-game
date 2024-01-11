package org.gamehunter.creategame.interfaces.builder;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Product;

public interface ComplexProduct extends Product {

    ArrayList<ComplexProductPart> getSections();

    ArrayList<ComplexProductPart> getConnections();

    @Override
    ComplexProduct createClone();
}
