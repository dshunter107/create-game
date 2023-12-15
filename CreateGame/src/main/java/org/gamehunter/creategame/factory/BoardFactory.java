package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.SimpleBoard;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

public class BoardFactory extends AbstractFactory {

    public BoardFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Product create(GameLocation loc, ArrayList<ConcreteCharacteristic> characteristics) {
        SimpleBoard board = new SimpleBoard(loc);
        return super.addCharacteristics(board, characteristics);
    }

}
