package org.gamehunter.creategame.objects.complexobjectparts;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.builder.ComplexProductPart;
import org.gamehunter.creategame.interfaces.connection.Connectable;
import org.gamehunter.creategame.locations.SectionLocation;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.complexobjects.ComplexGameObject;

public interface Section extends ComplexProductPart, Connectable {
    ArrayList<Section> getConnectedSections();

    ComplexGameObject getInGameObject();

    ArrayList<SectionLocation> getSectionLocations();

    boolean getHasLocation();

    GameAreaName getArea();

    void setCharacteristics(ArrayList<Characteristic> characteristics);
}
