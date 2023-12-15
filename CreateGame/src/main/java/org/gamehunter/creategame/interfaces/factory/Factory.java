package org.gamehunter.creategame.interfaces.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

public interface Factory {
    Product create(GameLocation loc, ArrayList<ConcreteCharacteristic> characteristics);

    Product addCharacteristics(Product product, ArrayList<ConcreteCharacteristic> characteristics);
}
