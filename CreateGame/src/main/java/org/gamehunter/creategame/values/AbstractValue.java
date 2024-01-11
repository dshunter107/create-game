package org.gamehunter.creategame.values;

import org.gamehunter.creategame.objects.upgrades.operations.Operation;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractValue<V> implements Value {

    @Getter
    @Setter
    private V value;

    Operation operation;

    public AbstractValue(V value) {
        this.value = value;
    }

}
