package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Factory;
import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

public abstract class AbstractFactory implements Factory {

    public AbstractFactory() {
    }

    @Override
    public Product addCharacteristics(Product product, ArrayList<ConcreteCharacteristic> characteristics) {
        for (ConcreteCharacteristic c : characteristics) {
            product.addCharacteristic(c);
        }
        return product;
    }
}
