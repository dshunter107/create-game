package org.gamehunter.creategame.values;

public class IntegerValue extends Value<Integer> {

    public IntegerValue(Integer value) {
        super(value);
    }

    @Override
    public Integer compareValues(Value<Integer> otherValue) {
        return Integer.compare(this.getValue(), otherValue.getValue());
    }
}
