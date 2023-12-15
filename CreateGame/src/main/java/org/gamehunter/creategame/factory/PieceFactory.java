package org.gamehunter.creategame.factory;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.locations.GameLocation;
import org.gamehunter.creategame.objects.SimplePiece;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

public class PieceFactory extends AbstractFactory {

    public PieceFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Product create(GameLocation loc, ArrayList<ConcreteCharacteristic> characteristics) {
        SimplePiece piece = new SimplePiece(loc);
        return super.addCharacteristics(piece, characteristics);
    }
}
