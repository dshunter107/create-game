package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.SimpleCard;
import org.gamehunter.creategame.objects.characteristics.Characteristic;

public class CardFactory extends AbstractFactory {

    public CardFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Product create(Location loc, ArrayList<Characteristic> characteristics) {
        SimpleCard card = new SimpleCard(loc);
        return super.addCharacteristics(card, characteristics);
    }
}
