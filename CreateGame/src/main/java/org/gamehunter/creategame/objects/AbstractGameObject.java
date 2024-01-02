package org.gamehunter.creategame.objects;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.observer.Observer;
import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.interfaces.registry.AbstractRegistrant;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractGameObject extends AbstractRegistrant
implements SimpleGameObject {

    private @Setter int cloneNumber;
    private Location inLocation;
    private @Setter Prototype clone;
    private ArrayList<Observer> address = new ArrayList<>();
    public ArrayList<Characteristic> characteristics = new ArrayList<>();

    protected AbstractGameObject(Location inLocation) {
        this.inLocation = inLocation;
        this.cloneNumber = 1;
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
    public AbstractGameObject addCharacteristic(Characteristic c) {
        this.characteristics.add(c);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Characteristic c : this.characteristics) {
            sb.append(c.toString());
        }
        return "GameItem [ characteristics="
        + sb.toString() + "]";
    }

    @Override
    public GameAreaName getArea() {
        return this.inLocation.getArea();
    }

    @Override
    public Prototype createClone() {
        this.clone.setCloneNumber(this.cloneNumber + 1);
        for (Characteristic c : this.characteristics) {
            this.clone.addCharacteristic(new ConcreteCharacteristic(c.getName(), c.getValue()));
        }
        return this.clone;
    }

}
