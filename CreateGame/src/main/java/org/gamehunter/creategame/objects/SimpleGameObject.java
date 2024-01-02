package org.gamehunter.creategame.objects;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.observer.Observer;
import org.gamehunter.creategame.interfaces.observer.Subject;
import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.interfaces.registry.Registrant;
import org.gamehunter.creategame.locations.Location;

public interface SimpleGameObject extends Registrant, Subject, Prototype {

    public Location getInLocation();

    public ArrayList<Observer> getAddress();

    public void setInLocation(Location newLocation);

    public GameAreaName getArea();
}
