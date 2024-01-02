package org.gamehunter.creategame.objects.complexobjectparts;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.connection.Connectable;
import org.gamehunter.creategame.interfaces.prototype.ComplexPartPrototype;
import org.gamehunter.creategame.locations.SectionLocation;
import org.gamehunter.creategame.objects.SimpleGameObject;
import org.gamehunter.creategame.objects.characteristics.Characteristic;

public interface Section extends ComplexPartPrototype, Connectable {
    ArrayList<Section> getConnectedSections();

    SimpleGameObject getInGameObject();

    ArrayList<SectionLocation> getSectionLocations();

    boolean getHasLocation();

    GameAreaName getArea();

    void setCharacteristics(ArrayList<Characteristic> characteristics);
}
