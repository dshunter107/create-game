package org.gamehunter.creategame.values;

import lombok.Getter;
import lombok.Setter;

public abstract class Value<V> implements Values {
    public static final boolean HAS_VALUE = true;

    @Getter
    @Setter
    private V value;

    Value(V value) {
        this.value = value;
    }

    @Override
    public boolean getHasValue() {
        return HAS_VALUE;
    }

    public boolean valuesMatch(Value<V> otherValue) {
        return this.value == otherValue.value;
    }

    public abstract Integer compareValues(Value<V> otherValue);

    @Override
    public String toString() {
        return "Value [value=" + this.value + "]";
    }

}
