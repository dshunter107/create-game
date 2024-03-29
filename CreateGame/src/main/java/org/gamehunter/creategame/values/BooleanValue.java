package org.gamehunter.creategame.values;

import org.gamehunter.creategame.objects.upgrades.executions.ExecutionEnvironment;

public class BooleanValue extends AbstractValue<Boolean> implements Comparable<BooleanValue> {

    public BooleanValue(Boolean value) {
        super(value);
    }

    @Override
    public int compareTo(BooleanValue secondValue) {
        return this.getValue().compareTo(secondValue.getValue());
    }

    @Override
    public Value operation(Value secondValue, ExecutionEnvironment execution) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Value createClone() {
        // TODO Auto-generated method stub
        return null;
    }

}
