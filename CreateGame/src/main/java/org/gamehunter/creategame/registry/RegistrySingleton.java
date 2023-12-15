package org.gamehunter.creategame.registry;

import java.util.HashMap;

import org.gamehunter.creategame.interfaces.registry.Registrant;
import org.gamehunter.creategame.interfaces.registry.Registry;
import org.gamehunter.creategame.interfaces.singleton.AbstractSingleton;


public class RegistrySingleton extends AbstractSingleton implements Registry {
    private static HashMap<byte[], Registrant> registryHashMap;

    public RegistrySingleton() {
        registryHashMap = new HashMap<>();
    }

    @Override
    protected AbstractSingleton instantiate() {
        return new RegistrySingleton();
    }

    @Override
    public boolean contains(Registrant registrant) {
        return RegistrySingleton.registryHashMap.get(registrant.getId()) == registrant;
    }

    @Override
    public Registrant putInRegistry(Registrant registrant) {
        RegistrySingleton.registryHashMap.put(registrant.getId(), registrant);
        return registrant;
    }

}
