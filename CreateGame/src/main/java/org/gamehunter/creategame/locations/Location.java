package org.gamehunter.creategame.locations;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.observer.Observer;
import org.gamehunter.creategame.interfaces.observer.Subject;
import org.gamehunter.creategame.interfaces.registry.Registrant;

public interface Location extends Registrant {

    ArrayList<Subject> getObjectsInThisLocation();

    ArrayList<Observer> getAddress();

    ArrayList<Observer> getAddressOfThingsInThisLocation();

    int numberOfItems();

    boolean hasItems();

    GameAreaName getArea();

}
