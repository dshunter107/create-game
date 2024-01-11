package org.gamehunter.creategame.interfaces.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.objects.characteristics.Characteristic;

public interface Product extends Prototype {
    Product addCharacteristic(Characteristic characteristic);

    ArrayList<Characteristic> getCharacteristics();

    ArrayList<Characteristic> getCharacteristics(String name);

    int getCloneNumber();

    void setCloneNumber(int cloneNumber);

    @Override
    Product createClone();
}
