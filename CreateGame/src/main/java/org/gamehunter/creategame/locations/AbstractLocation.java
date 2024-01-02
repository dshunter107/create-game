package org.gamehunter.creategame.locations;

import java.util.ArrayList;

import org.gamehunter.creategame.interfaces.observer.Observer;
import org.gamehunter.creategame.interfaces.observer.Subject;
import org.gamehunter.creategame.interfaces.registry.AbstractRegistrant;

import lombok.Getter;

@Getter
public abstract class AbstractLocation extends AbstractRegistrant implements Location {

    private ArrayList<Observer> address;
    private ArrayList<Observer> addressOfThingsInThisLocation;
    private ArrayList<Subject> objectsInThisLocation;
    protected String name;


    public AbstractLocation() {
        this.address = new ArrayList<>();
        this.addressOfThingsInThisLocation = new ArrayList<>();
        this.addressOfThingsInThisLocation.add(this);
        this.objectsInThisLocation = new ArrayList<>();
    }

    public AbstractLocation(GameLocation inLocation) {
        this.address = new ArrayList<>(inLocation.getAddressOfThingsInThisLocation());
        this.addressOfThingsInThisLocation = new ArrayList<>(this.address);
        this.addressOfThingsInThisLocation.add(this);
        this.objectsInThisLocation = new ArrayList<>();
    }

    @Override
    public void updateObserver(Subject subject) {
        if (subject.getObservers().containsAll(this.addressOfThingsInThisLocation)) {
            if (!this.objectsInThisLocation.contains(subject)) {
                this.objectsInThisLocation.add(subject);
            }
        } else {
            this.objectsInThisLocation.remove(subject);
        }
    }

    @Override
    public int numberOfItems() {
        return this.objectsInThisLocation.size();
    }

    @Override
    public boolean hasItems() {
        return this.objectsInThisLocation.size() > 0;
    }
}
