package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.SimplePiece;
import org.gamehunter.creategame.objects.characteristics.Characteristic;

public class PieceFactory extends AbstractFactory {

    public PieceFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Product create(Location loc, ArrayList<Characteristic> characteristics) {
        SimplePiece piece = new SimplePiece(loc);
        return super.addCharacteristics(piece, characteristics);
    }
}
