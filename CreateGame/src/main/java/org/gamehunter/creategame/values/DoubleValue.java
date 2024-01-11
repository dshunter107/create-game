package org.gamehunter.creategame.values;

import org.gamehunter.creategame.objects.upgrades.executions.ExecutionEnvironment;

public class DoubleValue extends AbstractValue<Double> implements Comparable<DoubleValue> {

    public DoubleValue(Double value) {
        super(value);
    }

    public DoubleValue(Integer value) {
        super(value * 1.0);
    }

    @Override
    public int compareTo(DoubleValue secondValue) {
        return this.getValue().compareTo(secondValue.getValue());
    }

    @Override
    public Value operation(Value secondValue, ExecutionEnvironment execution) {
        return new DoubleValue(execution.getCalculation().calculate(this.getValue(), secondValue.getValue()));
    }

    @Override
    public Value createClone() {
        // TODO Auto-generated method stub
        return null;
    }

}
