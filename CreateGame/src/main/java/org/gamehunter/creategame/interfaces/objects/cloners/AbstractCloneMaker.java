package org.gamehunter.creategame.interfaces.objects.cloners;

import org.gamehunter.creategame.interfaces.prototype.Prototype;
import org.gamehunter.creategame.objects.SimpleGameObject;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;

public abstract class AbstractCloneMaker implements CloneMaker {

    public Prototype buildClone(SimpleGameObject prototype, SimpleGameObject unfinishedClone) {
        unfinishedClone.setCloneNumber(prototype.getCloneNumber() + 1);
        for (Characteristic c : prototype.getCharacteristics()) {
            unfinishedClone.addCharacteristic(new ConcreteCharacteristic(c.getName(), c.getValue()));
        }
        return unfinishedClone;
    }

}
