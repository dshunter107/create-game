package org.gamehunter.creategame.objects;

import java.util.ArrayList;

import org.gamehunter.creategame.constants.GameAreaName;
import org.gamehunter.creategame.interfaces.factory.Product;
import org.gamehunter.creategame.interfaces.observer.Observer;
import org.gamehunter.creategame.interfaces.registry.AbstractRegistrant;
import org.gamehunter.creategame.locations.Location;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.characteristics.CharacteristicUser;
import org.gamehunter.creategame.objects.upgrades.Upgrade;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class AbstractGameObject extends AbstractRegistrant
implements SimpleGameObject {

    private @Setter int cloneNumber;
    private Location inLocation;
    private @Setter Product clone;
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
        this.notifyObservers();
    }

    @Override
    public void unregisterObserver(Observer lo) {
        ArrayList<Observer> oldAddress = new ArrayList<>(this.address);
        this.address.remove(lo);
        this.notifyObservers(oldAddress);
    }

    @Override
    public ArrayList<Observer> getObservers() {
        return this.address;
    }

    @Override
    public void notifyObservers(ArrayList<Observer> oldObservers) {
        for (Observer o : oldObservers) {
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
    public SimpleGameObject addCharacteristic(Characteristic c) {
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
    public Product createClone() {
        this.clone.setCloneNumber(this.cloneNumber + 1);
        for (Characteristic c : this.characteristics) {
            this.clone.addCharacteristic(c.createClone());
        }
        return this.clone;
    }

    @Override
    public ArrayList<Characteristic> getCharacteristics(String name) {
        ArrayList<Characteristic> theseCharacteristics = new ArrayList<>();
        if (name != null) {
            for (Characteristic c : this.characteristics) {
                if (name.equals(c.getName())) {
                    theseCharacteristics.add(c);
                }
            }
        }
        return theseCharacteristics;
    }

    @Override
    public CharacteristicUser addUpgrade(Upgrade upgrade) {
        String upgradeName = upgrade.getName();
        if(upgradeName != null) {
            for(Characteristic c: this.characteristics) {
                if(upgradeName.equals(c.getName())) {
                    Upgrade thisUpgrade = upgrade.createClone().setNestedObject(c);
                    this.characteristics.remove(c);
                    this.characteristics.add(thisUpgrade);

                }
            }
        }
        return this;
    }


}
