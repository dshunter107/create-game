package org.gamehunter.creategame.objects.upgrades;

import org.gamehunter.creategame.interfaces.decorator.Decorator;
import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.upgrades.operations.Operation;
import org.gamehunter.creategame.values.Value;

public interface Upgrade extends Decorator, Characteristic {

    @Override
    Value getValue();

    Upgrade setNestedObject(Characteristic characteristic);

    Upgrade setOperation(Operation operation);

    @Override
    Upgrade createClone();
}
