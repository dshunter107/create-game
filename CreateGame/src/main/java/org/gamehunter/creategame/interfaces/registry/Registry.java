package org.gamehunter.creategame.interfaces.registry;

public interface Registry {
    boolean contains(Registrant registrant);

    Registrant putInRegistry(Registrant registrant);
}
