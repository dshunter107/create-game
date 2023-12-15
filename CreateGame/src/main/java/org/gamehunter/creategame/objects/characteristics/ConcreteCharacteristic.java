package org.gamehunter.creategame.objects.characteristics;

import org.gamehunter.creategame.values.Values;

import lombok.Getter;
import lombok.Setter;

/**
 * Characteristic represents a name & value combination to describe a game
 * object
 */
public @Getter @Setter class ConcreteCharacteristic implements Characteristic {
    public String name;
    public Values value;

    /**
     * Characteristic represents a name & value combination to describe a game
     * object
     *
     * @param name
     * @param value
     */
    public ConcreteCharacteristic(String name, Values value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Characteristic [name=" + this.name + ", value=" + this.value + "]";
    }

}
