package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.SimpleBoard;
import org.gamehunter.creategame.objects.characteristics.Characteristic;

public class BoardFactory extends AbstractFactory {

    public BoardFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Product create(Location loc, ArrayList<Characteristic> characteristics) {
        SimpleBoard board = new SimpleBoard(loc);
        return super.addCharacteristics(board, characteristics);
    }

}
