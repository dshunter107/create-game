package org.gamehunter.creategame.objects.complexobjectparts;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.interfaces.connection.Connectable;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.SimpleGameObject;
import org.gamehunter.creategame.objects.characteristics.Characteristic;

public interface Section extends ComplexProductPart, Connectable {
    ArrayList<Section> getConnectedSections();

    SimpleGameObject getInGameObject();

    ArrayList<Location> getSectionLocations();

    boolean getHasLocation();

    GameAreaName getArea();

    void setCharacteristics(ArrayList<Characteristic> characteristics);
}
