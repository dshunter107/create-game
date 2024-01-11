package org.gamehunter.creategame.objects.upgrades.executions;

import org.gamehunter.creategame.objects.upgrades.executions.calculations.Calculation;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConcreteExecutionEnvironment implements ExecutionEnvironment {
    Calculation calculation;
}
