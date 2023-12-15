package org.gamehunter.creategame.objects;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.interfaces.observer.Observer;
import org.gamehunter.creategame.interfaces.observer.Subject;
import org.gamehunter.creategame.interfaces.registry.AbstractRegistrant;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

import lombok.Getter;

@Getter
public abstract class AbstractGameObject extends AbstractRegistrant
implements SimpleGameObject, Subject, Product {

    private Location inLocation;
    private ArrayList<Observer> address;
    public ArrayList<ConcreteCharacteristic> characteristics;

    protected AbstractGameObject(Location inLocation) {
        this.inLocation = inLocation;
        this.characteristics = new ArrayList<>();
        this.address = new ArrayList<>();
        this.updateAddress();
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer lo) {
        this.address.add(lo);
    }

    @Override
    public void unregisterObserver(Observer lo) {
        this.address.remove(lo);
    }

    @Override
    public ArrayList<Observer> getObservers() {
        return this.address;
    }

    @Override
    public void notifyObservers(ArrayList<Observer> oldAddress) {
        for (Observer o : oldAddress) {
            o.updateObserver(this);
        }
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.address) {
            o.updateObserver(this);
        }
    }

    public void updateAddress() {
        this.address = new ArrayList<Observer>(this.inLocation.getAddressOfThingsInThisLocation());
    }

    @Override
    public void setInLocation(Location newLocation) {
        ArrayList<Observer> oldAddress = this.address;
        this.inLocation = newLocation;
        this.updateAddress();
        this.notifyObservers(oldAddress);
    }

    @Override
    public AbstractGameObject addCharacteristic(ConcreteCharacteristic c) {
        this.characteristics.add(c);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ConcreteCharacteristic c : this.characteristics) {
            sb.append(c.toString());
        }
        return "GameItem [ characteristics="
        + sb.toString() + "]";
    }

    @Override
    public GameAreaName getArea() {
        return this.inLocation.getArea();
    }

}
