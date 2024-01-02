package org.gamehunter.creategame.interfaces.builder;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.prototype.ComplexPartPrototype;

public interface ComplexProduct {

    ArrayList<ComplexPartPrototype> getSections();

    ArrayList<ComplexPartPrototype> getConnections();
}
