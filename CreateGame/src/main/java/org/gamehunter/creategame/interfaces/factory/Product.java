package org.gamehunter.creategame.interfaces.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.objects.characteristics.Characteristic;

public interface Product {
    Product addCharacteristic(Characteristic characteristic);

    ArrayList<Characteristic> getCharacteristics();
}
