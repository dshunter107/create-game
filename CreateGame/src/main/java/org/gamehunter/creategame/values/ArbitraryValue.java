package org.gamehunter.creategame.values;

import org.gamehunter.creategame.exceptions.NoValueRuntimeException;

public class ArbitraryValue<V> extends Value<V> {

    public ArbitraryValue(V value) {
        super(value);
    }

    @Override
    public Integer compareValues(Value<V> otherValue) {
        throw new NoValueRuntimeException("No Value to Compare");
    }

}
