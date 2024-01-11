package org.gamehunter.creategame.values;

import org.gamehunter.creategame.objects.upgrades.executions.ExecutionEnvironment;

public class ArbitraryValue<V> extends AbstractValue<V> {

    public ArbitraryValue(V value) {
        super(value);
    }

    @Override
    public Value operation(Value secondValue, ExecutionEnvironment execution) {
        return null;
    }

    @Override
    public Value createClone() {
        // TODO Auto-generated method stub
        return null;
    }

}
