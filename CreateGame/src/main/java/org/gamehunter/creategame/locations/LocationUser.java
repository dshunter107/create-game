package org.gamehunter.creategame.locations;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.observer.Observer;
import org.gamehunter.creategame.interfaces.observer.Subject;

public interface LocationUser extends Subject {
    Location getInLocation();

    ArrayList<Observer> getAddress();

    void setInLocation(Location newLocation);

    GameAreaName getArea();
}
