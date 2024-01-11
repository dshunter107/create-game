package org.gamehunter.creategame.objects.upgrades.executions;

import org.gamehunter.creategame.objects.upgrades.executions.calculations.Calculation;

public interface ExecutionEnvironment {

    Calculation getCalculation();

    void setCalculation(Calculation calculation);
}
