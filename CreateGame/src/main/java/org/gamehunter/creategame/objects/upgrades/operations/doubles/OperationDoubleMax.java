package org.gamehunter.creategame.objects.upgrades.operations.doubles;

import org.gamehunter.creategame.objects.upgrades.executions.ConcreteExecutionEnvironment;
import org.gamehunter.creategame.objects.upgrades.executions.ExecutionEnvironment;
import org.gamehunter.creategame.objects.upgrades.executions.calculations.Calculation;
import org.gamehunter.creategame.objects.upgrades.executions.calculations.Max;
import org.gamehunter.creategame.objects.upgrades.operations.Operation;
import org.gamehunter.creategame.values.Value;

public class OperationDoubleMax implements Operation {
    Calculation max = new Max();
    ExecutionEnvironment executionEnvironment = new ConcreteExecutionEnvironment();

    @Override
    public Value operateValues(Value firstValue, Value secondValue) {
        this.executionEnvironment.setCalculation(this.max);
        return firstValue.operation(secondValue, this.executionEnvironment);
    }

}
