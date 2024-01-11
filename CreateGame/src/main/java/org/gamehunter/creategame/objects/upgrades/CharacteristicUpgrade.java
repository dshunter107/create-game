package org.gamehunter.creategame.objects.upgrades;

import org.gamehunter.creategame.objects.characteristics.Characteristic;
import org.gamehunter.creategame.objects.characteristics.ConcreteCharacteristic;
import org.gamehunter.creategame.objects.upgrades.operations.Operation;
import org.gamehunter.creategame.values.Value;


public class CharacteristicUpgrade extends ConcreteCharacteristic implements Upgrade {
    private Characteristic nestedObject;
    private Operation operation;

    public CharacteristicUpgrade(String name, Value value) {
        super(name, value);
    }

    @Override
    public Upgrade setNestedObject(Characteristic characteristic) {
        this.nestedObject = characteristic;
        return this;
    }

    @Override
    public Value getValue() {
        return this.operation.operateValues(super.getValue(), this.nestedObject.getValue());
    }

    @Override
    public Upgrade setOperation(Operation operation) {
        this.operation = operation;
        return this;
    }

    @Override
    public Upgrade createClone() {
        return new CharacteristicUpgrade(this.name, this.value)
                .setNestedObject(this.nestedObject)
                .setOperation(this.operation);
    }
}
