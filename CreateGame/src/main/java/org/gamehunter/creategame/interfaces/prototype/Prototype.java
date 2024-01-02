package org.gamehunter.creategame.interfaces.prototype;

import org.gamehunter.creategame.interfaces.factory.Product;

public interface Prototype extends Product {

    Prototype createClone();

    int getCloneNumber();

    void setCloneNumber(int cloneNumber);
}
