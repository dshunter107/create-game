package org.gamehunter.creategame.values;

import org.gamehunter.creategame.constants.BooleanValueConstant;
import org.gamehunter.creategame.exceptions.NoValueRuntimeException;

public class BooleanValue extends Value<BooleanValueConstant> {

    public BooleanValue(BooleanValueConstant value) {
        super(value);
    }

    @Override
    public Integer compareValues(Value<BooleanValueConstant> otherValue) {
        throw new NoValueRuntimeException("No Value to Compare");
    }
}
