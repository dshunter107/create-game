package org.gamehunter.creategame.objects.upgrades.operations.doubles;

import org.gamehunter.creategame.objects.upgrades.executions.ConcreteExecutionEnvironment;
import org.gamehunter.creategame.objects.upgrades.executions.ExecutionEnvironment;
import org.gamehunter.creategame.objects.upgrades.executions.calculations.Add;
import org.gamehunter.creategame.objects.upgrades.executions.calculations.Calculation;
import org.gamehunter.creategame.objects.upgrades.operations.Operation;
import org.gamehunter.creategame.values.Value;

public class OperationDoubleAdd implements Operation {
    Calculation add = new Add();
    ExecutionEnvironment executionEnvironment = new ConcreteExecutionEnvironment();

    @Override
    public Value operateValues(Value firstValue, Value secondValue) {
        this.executionEnvironment.setCalculation(this.add);
        return firstValue.operation(secondValue, this.executionEnvironment);
    }
}
