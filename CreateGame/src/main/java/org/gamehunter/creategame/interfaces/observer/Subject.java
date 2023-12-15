package org.gamehunter.creategame.interfaces.observer;

import java.util.ArrayList;

public interface Subject {
    void registerObserver(Observer loc);

    void unregisterObserver(Observer loc);

    void notifyObservers(ArrayList<Observer> additionalObservers);

    void notifyObservers();

    ArrayList<Observer> getObservers();
}
