package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.SimpleCard;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

public class CardFactory extends AbstractFactory {

    public CardFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Product create(GameLocation loc, ArrayList<ConcreteCharacteristic> characteristics) {
        SimpleCard card = new SimpleCard(loc);
        return super.addCharacteristics(card, characteristics);
    }
}
