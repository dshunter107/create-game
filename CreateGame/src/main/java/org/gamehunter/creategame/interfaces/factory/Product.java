package org.gamehunter.creategame.interfaces.factory;

import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

public interface Product {
    Product addCharacteristic(ConcreteCharacteristic characteristics);
}
