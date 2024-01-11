package org.gamehunter.creategame.objects.characteristics;

import org.gamehunter.creategame.values.Value;

import lombok.Getter;
import lombok.Setter;

/**
 * Characteristic represents a name & value combination to describe a game
 * object
 */
public @Getter @Setter class ConcreteCharacteristic implements Characteristic {
    protected String name;
    protected Value value;

    /**
     * Characteristic represents a name & value combination to describe a game
     * object
     *
     * @param name
     * @param value
     */
    public ConcreteCharacteristic(String name, Value value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Characteristic [name=" + this.name + ", value=" + this.value + "]";
    }

    @Override
    public Characteristic createClone() {
        return new ConcreteCharacteristic(this.name, this.value.createClone());
    }

}
