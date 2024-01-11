package org.gamehunter.creategame.objects;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.interfaces.registry.Registrant;
import org.gamehunter.creategame.locations.LocationUser;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.characteristics.CharacteristicUser;

public interface SimpleGameObject extends LocationUser, CharacteristicUser, Product, Registrant {
    @Override
    SimpleGameObject addCharacteristic(Characteristic characteristic);
}
