package org.gamehunter.creategame.interfaces.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.characteristics.Characteristic;

public interface Factory {
    Product create(Location loc, ArrayList<Characteristic> characteristics);

    Product addCharacteristics(Product product, ArrayList<Characteristic> characteristics);
}
